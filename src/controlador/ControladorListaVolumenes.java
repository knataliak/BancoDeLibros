package controlador;

import static bbdd.Seleccionar.volumenes;
import modeloVolumen.ListaVolumenes;
import modeloVolumen.Volumen;

public class ControladorListaVolumenes {
        private int posicion;
        private ListaVolumenes lv;
        
        public ControladorListaVolumenes() {
            posicion=0;
            lv=new ListaVolumenes();
            lv=volumenes;
        } 
        
        public Volumen getVolumen(){
            return lv.getVolumen(posicion);
        }
        
        public Volumen getVolumenP(int p){
            return lv.getVolumen(p);
        }
        
        public Volumen primero(){
            posicion=0;
            return lv.getVolumen(posicion);
        }
        
        public Volumen ultimo(){
            posicion=lv.longitud()-1;
            return lv.getVolumen(posicion);
        }
        
        public Volumen anterior(){
            if (posicion>0){
                posicion--;
            }
            return lv.getVolumen(posicion);
        }
        
        public Volumen siguiente(){
            posicion++;
            if (posicion==lv.longitud()){
                posicion--;
            }
            return lv.getVolumen(posicion);
        }
        
        public void nuevo(Volumen v){
            lv.setVolumen(v);
            posicion=lv.longitud()-1;
            //Acceso.guardarLL(ll);
        }
        public void eliminar(){
            //elimino la posición actual y guardo cambios en fichero
            lv.eliminar(posicion);
            //guardo en fichero:
            //Acceso.guardarLL(ll);
        }    
        public void actualizar(Volumen v){
            //actualizo el ListaLibros y guardo en fichero
            lv.actualizar(v, posicion);
            //Acceso.guardarLL(ll);
        }
}