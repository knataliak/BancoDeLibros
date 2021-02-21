package modeloAlumno;

import java.util.ArrayList;

public class ListaAlumnos {
    public ArrayList<Alumno> listaAlumnos;
    
    public ListaAlumnos() {
        listaAlumnos = new ArrayList<>();
    }
    
    public Alumno getAlumno(int p){
        return listaAlumnos.get(p);
    }
    
    public void setAlumno(Alumno a) {
        listaAlumnos.add(a);
    }
    
    public int longitud(){
        return listaAlumnos.size();
    }
    
    public void eliminar(int p){
        listaAlumnos.remove(p);
    }
    
    public void actualizar(Alumno a, int p){
        listaAlumnos.get(p).setNia(a.getNia());
        listaAlumnos.get(p).setNombre(a.getNombre());
        listaAlumnos.get(p).setApellido1(a.getApellido1());
        listaAlumnos.get(p).setApellido2(a.getApellido2());
        listaAlumnos.get(p).setGenero(a.getGenero());
        listaAlumnos.get(p).setTipo(a.getTipo());
        listaAlumnos.get(p).setMotivoBeca(a.getMotivoBeca());
        listaAlumnos.get(p).setObservaciones(a.getObservaciones());
    }
    
    public void borrar(){
        listaAlumnos.clear();
    }
    
}
