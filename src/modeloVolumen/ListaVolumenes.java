package modeloVolumen;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaVolumenes implements Serializable {
    
    public ArrayList<Volumen> listaVolumenes;
    
    public ListaVolumenes() {
        listaVolumenes = new ArrayList<>();
    }
    
    public Volumen getVolumen(int p){
        return listaVolumenes.get(p);
    }
    
    public void setVolumen(Volumen v) {
        listaVolumenes.add(v);
    }
    
    public int longitud(){
        return listaVolumenes.size();
    }
    
    public void eliminar(int p){
        listaVolumenes.remove(p);
    }
    
    public void actualizar(Volumen v, int p){
        listaVolumenes.get(p).setTitulo(v.getTitulo());
        listaVolumenes.get(p).setIsbn(v.getIsbn());
        listaVolumenes.get(p).setEditorial(v.getEditorial());
        listaVolumenes.get(p).setColeccion(v.getColeccion());
        listaVolumenes.get(p).setNumVolumen(v.getNumVolumen());
        listaVolumenes.get(p).setCantVolumenes(v.getCantVolumenes());
        listaVolumenes.get(p).setNumPaginas(v.getNumPaginas());
        listaVolumenes.get(p).setObservaciones(v.getObservaciones());
    }
    
    public void borrar(){
        listaVolumenes.clear();
    }
    
}
