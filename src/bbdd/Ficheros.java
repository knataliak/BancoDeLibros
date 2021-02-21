package bbdd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ficheros {
    
    //importar fichero con alumnos
    public static void importarFicheroAlumnos(String f) {
        String sentenciaSql = "COPY alumno(nia, nombre, primer_apellido, segundo_apellido, genero, tipo, motivo_beca, observaciones) from '"+f+"' DELIMITER ',' CSV HEADER encoding 'UTF8'";
        PreparedStatement s = null;
        try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (s != null)
            { try {
                s.close();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
            }
        }
    }
    
    //importar fichero con volumenes
    public static void importarFicheroVolumenes(String f) {
        String sentenciaSql = "COPY volumen(titulo, isbn, editorial, coleccion, num_paginas, num_volumen, cantidad_volumen, observaciones) from '"+f+"' DELIMITER ',' CSV HEADER encoding 'UTF8'";
        PreparedStatement s = null;
        try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (s != null)
            { try {
                s.close();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
            }
        }
    }
    
    //importar fichero con asignaturas
    public static void importarFicheroAsignaturas(String f) {
        String sentenciaSql = "COPY asignatura(ensenyanza, curso, codigo, nombre_cas, nombre_val) from '"+f+"' DELIMITER ',' CSV HEADER encoding 'UTF8'";
        PreparedStatement s = null;
        try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (s != null)
            { try {
                s.close();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
            }
        }
    }
    
    //borrar tabla alumnos
    public static void borrarTablaAlumno() {
        String sentenciaSql = "TRUNCATE TABLE alumno CASCADE;";
        PreparedStatement s = null;
        try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (s != null)
            { try {
                s.close();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
            }
        }
    }
    
    //borrar tabla volumen
    public static void borrarTablaVolumen() {
        String sentenciaSql = "TRUNCATE TABLE volumen CASCADE;";
        PreparedStatement s = null;
        try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (s != null)
            { try {
                s.close();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
            }
        }
    }
    
    //borrar tabla asignatura
    public static void borrarTablaAsignatura() {
        String sentenciaSql = "TRUNCATE TABLE alumno CASCADE;";
        PreparedStatement s = null;
        try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (s != null)
            { try {
                s.close();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
            }
        }
    }
    
//    public static void importarFichero(String f) throws SQLException, IOException {
//        Conexion.Conectar();
//        String sql = f;
//        
//        PreparedStatement psvaciar = Conexion.c.prepareStatement("DELETE from alumnos");
//        psvaciar.execute();
//
//        BufferedReader br = null;
//        String line = "";
//        String csvSplitBy = ",";
//        int currentLine = 0;
//        
//        try{
//            br = new BufferedReader(Files.newBufferedReader(Paths.get(sql), StandardCharsets.UTF_8));
//            PreparedStatement prep = Conexion.c.prepareStatement("INSERT INTO alumnos(ensenyanza, curso, grupo, alumno, nia) values (?, ?, ?, ?, ?)");
//            
//            while((line = br.readLine()) != null){
//                if(currentLine >= 0) {
//                    String[] table = line.split(csvSplitBy);
//                    int tamanyo = table.length;
//                    int j = 0;
//                    for(int i = 0; i < tamanyo; i++){
//                        j = i+1;
//                        prep.setString(j, (table[i]));
//                    }
//                    prep.execute();
//                    for(int i = 0; i < tamanyo; i++){
//                        j = i+1;
//                        prep.setString(j, null);
//                    }
//                }
//                currentLine++;
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Conexion.Desconectar();
//        
//    }
    
    
    
}
