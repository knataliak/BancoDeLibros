package bbdd;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class Insertar {
    
    //insertar en la tabla VOLUMEN
    public static void insertarVolumen(String titulo, String isbn, String editorial, String coleccion, int num_paginas, int num_volumen, int cantidad_volumen, String observaciones) {
        Conexion.Conectar();
	String sentenciaSql = "INSERT INTO volumen(titulo, isbn, editorial, coleccion, num_paginas, num_volumen, cantidad_volumen, observaciones) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement s = null;
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.setString(1, titulo);
            s.setString(2, isbn);
            s.setString(3, editorial);
            s.setString(4, coleccion);
            s.setInt(5, num_paginas);
            s.setInt(6, num_volumen);
            s.setInt(7, cantidad_volumen);
            s.setString(8,  observaciones);
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
    
    //insertar en la tabla EJEMPLAR
    public static void insertarEjemplar(String fecha, String sitio, String observaciones, int id_volumen) {
        Conexion.Conectar();
	String sentenciaSql = "INSERT INTO ejemplar(fecha_compra, sitio_compra, observaciones, id_volumen) VALUES(?, ?, ?, ?)";
	PreparedStatement s = null;
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.setString(1, fecha);
            s.setString(2, sitio);
            s.setString(3, observaciones);
            s.setInt(4, id_volumen);
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
    
    //insertar en la tabla ALUMNO
    public static void insertarAlumno(int nia, String nombre, String primerApellido, String segundoApellido, 
            String genero, String tipo, String motivoBeca, String observaciones) {
        Conexion.Conectar();
	String sentenciaSql = "INSERT INTO alumno(nia, nombre, primer_apellido, segundo_apellido, "
                + "tipo, motivo_beca, observaciones, genero) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement s = null;
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.setInt(1, nia);
            s.setString(2, nombre);
            s.setString(3, primerApellido);
            s.setString(4, segundoApellido);
            s.setString(5, tipo);
            s.setString(6, motivoBeca);
            s.setString(7, observaciones);
            s.setString(8, genero);
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
    
    //insertar en la tabla ESTUDIA
    public static void insertarEstudia(int id_alumno, int id_asignatura, String curso_escolar, String ensenyanza, 
            int num_curso, String grupo) {
        Conexion.Conectar();
	String sentenciaSql = "INSERT INTO estudia(id_alumno, id_asignatura, curso_escolar, ensenyanza, "
                + "num_curso, grupo) VALUES(?, ?, ?, ?, ?, ?)";
	PreparedStatement s = null;
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.setInt(1, id_alumno);
            s.setInt(2, id_asignatura);
            s.setString(3, curso_escolar);
            s.setString(4, ensenyanza);
            s.setInt(5, num_curso);
            s.setString(6, grupo);
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
}
