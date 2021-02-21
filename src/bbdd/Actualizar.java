package bbdd;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Actualizar {
    
    public static void actualizarVolumen(int idVolumen, String titulo, String isbn, 
            String editorial, String coleccion, int numVol, int cantVol, int numPag, String observaciones){
        Conexion.Conectar();
        String sentenciaSql = "UPDATE volumen SET titulo = ?, isbn = ?, editorial = ?, "
                + "coleccion = ?, num_volumen = ?, cantidad_volumen = ?, num_paginas = ?, "
                + "observaciones = ? WHERE id_volumen = '"+idVolumen+"'";
        PreparedStatement s = null;
        try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.setString(1, titulo);
            s.setString(2, isbn);
            s.setString(3, editorial);
            s.setString(4, coleccion);
            s.setInt(5, numVol);
            s.setInt(6, cantVol);
            s.setInt(7, numPag);
            s.setString(8, observaciones);
            System.out.println(sentenciaSql);
            s.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
	} finally {
            if (s != null)
		try {
                    s.close();
		} catch (SQLException sqle) {
                    sqle.printStackTrace();
		}
	}
    }
    
    public static void actualizarAlumno(int idAlumno, int nia, String nombre, String pApellido, 
            String sApellido, String tipo, String motivo, String observaciones, String genero){
        Conexion.Conectar();
        String sentenciaSql = "UPDATE alumno SET nia = ?, nombre = ?, primer_apellido = ?, segundo_apellido = ?, "
                + "tipo = ?, motivo_beca = ?, observaciones = ?, genero = ? WHERE id_alumno = '"+idAlumno+"'";
        PreparedStatement s = null;
        try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.setInt(1, nia);
            s.setString(2, nombre);
            s.setString(3, pApellido);
            s.setString(4, sApellido);
            s.setString(5, tipo);
            s.setString(6, motivo);
            s.setString(7, observaciones);
            s.setString(8, genero);
            System.out.println(sentenciaSql);
            s.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
	} finally {
            if (s != null)
		try {
                    s.close();
		} catch (SQLException sqle) {
                    sqle.printStackTrace();
		}
	}
    }
    
    public static void actualizarEstudio(int idAlumno, String cursoEscolar, String ensenyanza, int numCurso, 
            String grupo){
        Conexion.Conectar();
        String sentenciaSql = "UPDATE estudia SET curso_escolar = ?, ensenyanza = ?, num_curso = ?, grupo = ? WHERE id_alumno = '"+idAlumno+"'";
        PreparedStatement s = null;
        try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            s.setString(1, cursoEscolar);
            s.setString(2, ensenyanza);
            s.setInt(3, numCurso);
            s.setString(4, grupo);
            System.out.println(sentenciaSql);
            s.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
	} finally {
            if (s != null)
		try {
                    s.close();
		} catch (SQLException sqle) {
                    sqle.printStackTrace();
		}
	}
    }
}
