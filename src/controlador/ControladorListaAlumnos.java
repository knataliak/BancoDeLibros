package controlador;

import static bbdd.Seleccionar.alumnos;
import modeloAlumno.Alumno;
import modeloAlumno.ListaAlumnos;

public class ControladorListaAlumnos {
        private int posicion;
        private ListaAlumnos la;
        
        public ControladorListaAlumnos() {
            posicion=0;
            la=new ListaAlumnos();
            la=alumnos;
        } 
        
        public Alumno getAlumno(){
            return la.getAlumno(posicion);
        }
        
        public Alumno primero(){
            posicion=0;
            return la.getAlumno(posicion);
        }
        
        public Alumno ultimo(){
            posicion=la.longitud()-1;
            return la.getAlumno(posicion);
        }
        
        public Alumno anterior(){
            if (posicion>0){
                posicion--;
            }
            return la.getAlumno(posicion);
        }
        
        public Alumno siguiente(){
            posicion++;
            if (posicion==la.longitud()){
                posicion--;
            }
            return la.getAlumno(posicion);
        }
        
        public void nuevo(Alumno a){
            la.setAlumno(a);
            posicion=la.longitud()-1;
        }
        public void eliminar(){
            la.eliminar(posicion);
        }    
        public void actualizar(Alumno a){
            la.actualizar(a, posicion);
        }
}