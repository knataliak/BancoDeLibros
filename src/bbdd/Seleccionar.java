package bbdd;

import vista.BuscarVolumen;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modeloAlumno.Alumno;
import modeloAlumno.ListaAlumnos;
import modeloEstudia.Estudia;
import modeloEstudia.ListaEstudia;
import modeloVolumen.ListaVolumenes;
import modeloVolumen.Volumen;

public class Seleccionar {
    public static int id_vol;
    public static ListaVolumenes volumenes = new ListaVolumenes();
    public static ListaAlumnos alumnos = new ListaAlumnos();
    public static ArrayList asignatura = new ArrayList();
    public static ListaEstudia estudia = new ListaEstudia();
    
    //consultar id_volumen
    public static void consultarIdVolumen(String isbn){
        Conexion.Conectar();
        String sentenciaSql = "SELECT id_volumen FROM volumen WHERE isbn = '"+isbn+"'";
	PreparedStatement s = null;
        ResultSet res = null;
        System.out.println(sentenciaSql);
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            res = s.executeQuery();
            while(res.next()){
                id_vol = res.getInt(1);
            }
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
    
    //buscar por titulo
    public static void buscarVolumenPorTitulo(String titulo){
        Conexion.Conectar();
        String sentenciaSql = "SELECT * FROM volumen WHERE titulo ILIKE '%"+titulo+"%'";
	PreparedStatement s = null;
        ResultSet res = null;
        System.out.println(sentenciaSql);
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            res = s.executeQuery();
            while(res.next()){
                Volumen a = new Volumen();
		a.setIdVolumen(res.getInt("id_volumen"));
                a.setTitulo(res.getString("titulo"));
                a.setIsbn(res.getString("isbn"));
                a.setEditorial(res.getString("editorial"));
                a.setColeccion(res.getString("coleccion"));
                a.setNumVolumen(res.getInt("num_volumen"));
                a.setCantVolumenes(res.getInt("cantidad_volumen"));
                a.setNumPaginas(res.getInt("num_paginas"));
                a.setObservaciones(res.getString("observaciones"));
                
		volumenes.setVolumen(a);
            }
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
    
    //buscar volumen por isbn
    public static void buscarVolumenPorISBN(String isbn){
        Conexion.Conectar();
        String sentenciaSql = "SELECT * FROM volumen WHERE isbn ILIKE '%"+isbn+"%'";
	PreparedStatement s = null;
        ResultSet res = null;
        System.out.println(sentenciaSql);
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            res = s.executeQuery();
            while(res.next()){
                Volumen a = new Volumen();
		a.setIdVolumen(res.getInt("id_volumen"));
                a.setTitulo(res.getString("titulo"));
                a.setIsbn(res.getString("isbn"));
                a.setEditorial(res.getString("editorial"));
                a.setColeccion(res.getString("coleccion"));
                a.setNumVolumen(res.getInt("num_volumen"));
                a.setCantVolumenes(res.getInt("cantidad_volumen"));
                a.setNumPaginas(res.getInt("num_paginas"));
                a.setObservaciones(res.getString("observaciones"));
                
		volumenes.setVolumen(a);
            }
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
    
    //buscar volumen por editorial
    public static void buscarVolumenPorEditorial(String editorial){
        Conexion.Conectar();
        String sentenciaSql = "SELECT * FROM volumen WHERE editorial ILIKE '%"+editorial+"%'";
	PreparedStatement s = null;
        ResultSet res = null;
        System.out.println(sentenciaSql);
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            res = s.executeQuery();
            while(res.next()){
                Volumen a = new Volumen();
		a.setIdVolumen(res.getInt("id_volumen"));
                a.setTitulo(res.getString("titulo"));
                a.setIsbn(res.getString("isbn"));
                a.setEditorial(res.getString("editorial"));
                a.setColeccion(res.getString("coleccion"));
                a.setNumVolumen(res.getInt("num_volumen"));
                a.setCantVolumenes(res.getInt("cantidad_volumen"));
                a.setNumPaginas(res.getInt("num_paginas"));
                a.setObservaciones(res.getString("observaciones"));
                
		volumenes.setVolumen(a);
            }
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
    
    //seleccionar todos volumenes
    public static void buscarTodosVolumenes(){
        Conexion.Conectar();
        String sentenciaSql = "SELECT * FROM volumen";
	PreparedStatement s = null;
        ResultSet res = null;
        System.out.println(sentenciaSql);
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            res = s.executeQuery();
            while(res.next()){
                Volumen a = new Volumen();
		a.setIdVolumen(res.getInt("id_volumen"));
                a.setTitulo(res.getString("titulo"));
                a.setIsbn(res.getString("isbn"));
                a.setEditorial(res.getString("editorial"));
                a.setColeccion(res.getString("coleccion"));
                a.setNumVolumen(res.getInt("num_volumen"));
                a.setCantVolumenes(res.getInt("cantidad_volumen"));
                a.setNumPaginas(res.getInt("num_paginas"));
                a.setObservaciones(res.getString("observaciones"));
                
		volumenes.setVolumen(a);
            }
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
    
    //buscar alumno por nombre y primer apellido
    public static void buscarAlumnoNombreApellido(String nombre, String apellido){
        Conexion.Conectar();
        String sentenciaSql = "SELECT * FROM alumno WHERE nombre ILIKE '%"+nombre+"%' AND primer_apellido ILIKE '%"+apellido+"%'";
	PreparedStatement s = null;
        ResultSet res = null;
        System.out.println(sentenciaSql);
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            res = s.executeQuery();
            while(res.next()){
                Alumno a = new Alumno();
		a.setIdAlumno(res.getInt("id_alumno"));
                a.setNia(res.getInt("nia"));
                a.setNombre(res.getString("nombre"));
                a.setApellido1(res.getString("primer_apellido"));
                a.setApellido2(res.getString("segundo_apellido"));
                a.setGenero(res.getString("genero"));
                a.setTipo(res.getInt("tipo"));
                a.setMotivoBeca(res.getString("motivo_beca"));
                a.setObservaciones(res.getString("observaciones"));
                
		alumnos.setAlumno(a);
            }
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
    
    //buscar alumno por nombre
    public static void buscarAlumnoNombre(String nombre){
        Conexion.Conectar();
        String sentenciaSql = "SELECT * FROM alumno WHERE nombre ILIKE '%"+nombre+"%'";
	PreparedStatement s = null;
        ResultSet res = null;
        System.out.println(sentenciaSql);
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            res = s.executeQuery();
            while(res.next()){
                Alumno a = new Alumno();
		a.setIdAlumno(res.getInt("id_alumno"));
                a.setNia(res.getInt("nia"));
                a.setNombre(res.getString("nombre"));
                a.setApellido1(res.getString("primer_apellido"));
                a.setApellido2(res.getString("segundo_apellido"));
                a.setGenero(res.getString("genero"));
                a.setTipo(res.getInt("tipo"));
                a.setMotivoBeca(res.getString("motivo_beca"));
                a.setObservaciones(res.getString("observaciones"));
                
		alumnos.setAlumno(a);
            }
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
    
    //buscar alumno por NIA
    public static void buscarAlumnoNIA(int nia){
        Conexion.Conectar();
        String sentenciaSql = "SELECT * FROM alumno WHERE nia = '"+nia+"'";
	PreparedStatement s = null;
        ResultSet res = null;
        System.out.println(sentenciaSql);
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            res = s.executeQuery();
            while(res.next()){
                Alumno a = new Alumno();
		a.setIdAlumno(res.getInt("id_alumno"));
                a.setNia(res.getInt("nia"));
                a.setNombre(res.getString("nombre"));
                a.setApellido1(res.getString("primer_apellido"));
                a.setApellido2(res.getString("segundo_apellido"));
                a.setGenero(res.getString("genero"));
                a.setTipo(res.getInt("tipo"));
                a.setMotivoBeca(res.getString("motivo_beca"));
                a.setObservaciones(res.getString("observaciones"));
                
		alumnos.setAlumno(a);
            }
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
    
    //buscar alumno por primer apellido
    public static void buscarAlumnoPrimerApellido(String pApellido){
        Conexion.Conectar();
        String sentenciaSql = "SELECT * FROM alumno WHERE primer_apellido ILIKE '%"+pApellido+"%'";
	PreparedStatement s = null;
        ResultSet res = null;
        System.out.println(sentenciaSql);
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            res = s.executeQuery();
            while(res.next()){
                Alumno a = new Alumno();
		a.setIdAlumno(res.getInt("id_alumno"));
                a.setNia(res.getInt("nia"));
                a.setNombre(res.getString("nombre"));
                a.setApellido1(res.getString("primer_apellido"));
                a.setApellido2(res.getString("segundo_apellido"));
                a.setGenero(res.getString("genero"));
                a.setTipo(res.getInt("tipo"));
                a.setMotivoBeca(res.getString("motivo_beca"));
                a.setObservaciones(res.getString("observaciones"));
                
		alumnos.setAlumno(a);
            }
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
    
    //buscar asignatura por el curso en el que esta matriculado un alumno
    public static void buscarAsignatura(String curso){
        Conexion.Conectar();
        String sentenciaSql = "SELECT id_asignatura FROM asignatura WHERE asignatura.curso = '"+curso+"'";
	PreparedStatement s = null;
        ResultSet res = null;
        System.out.println(sentenciaSql);
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            res = s.executeQuery();
            while(res.next()){
                int o = res.getInt("id_asignatura");
                
		asignatura.add(o);
            }
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
    
    //buscar alumno en la tabla ESTUDIA
    public static void buscarAlumnoESTUDIA(int id_alumno){
        Conexion.Conectar();
        String sentenciaSql = "SELECT * FROM estudia WHERE id_alumno = '"+id_alumno+"'";
	PreparedStatement s = null;
        ResultSet res = null;
        System.out.println(sentenciaSql);
	try {
            s = Conexion.c.prepareStatement(sentenciaSql);
            res = s.executeQuery();
            while(res.next()){
                Estudia e = new Estudia();
                
		e.setIdAlumno(res.getInt("id_alumno"));
                e.setIdAsignatura(res.getInt("id_asignatura"));
                e.setEnsenyanza(res.getString("ensenyanza"));
                e.setNumCurso(res.getInt("num_curso"));
                e.setGrupo(res.getString("grupo"));
                e.setCursoEscolar(res.getString("curso_escolar"));
                
		estudia.setEstudia(e);
            }
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
