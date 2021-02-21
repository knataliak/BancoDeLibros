package controlador;

import static bbdd.Seleccionar.estudia;
import modeloEstudia.Estudia;
import modeloEstudia.ListaEstudia;

public class ControladorListaEstudia {
        private int posicion;
        private ListaEstudia le;
        
        public ControladorListaEstudia() {
            posicion=0;
            le=new ListaEstudia();
            le=estudia;
        } 
        
        public Estudia getEstudia(){
            return le.getEstudia(posicion);
        }
        
        public Estudia primero(){
            posicion=0;
            return le.getEstudia(posicion);
        }
        
        public Estudia ultimo(){
            posicion=le.longitud()-1;
            return le.getEstudia(posicion);
        }
        
        public Estudia anterior(){
            if (posicion>0){
                posicion--;
            }
            return le.getEstudia(posicion);
        }
        
        public Estudia siguiente(){
            posicion++;
            if (posicion==le.longitud()){
                posicion--;
            }
            return le.getEstudia(posicion);
        }
        
        public void nuevo(Estudia a){
            le.setEstudia(a);
            posicion=le.longitud()-1;
        }
        public void eliminar(){
            le.eliminar(posicion);
        }    
        public void actualizar(Estudia a){
            le.actualizar(a, posicion);
        }
}