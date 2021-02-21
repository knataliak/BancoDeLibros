package modeloEstudia;

import java.util.ArrayList;

public class ListaEstudia {
    public ArrayList<Estudia> listaEstudia;
    
    public ListaEstudia() {
        listaEstudia = new ArrayList<>();
    }
    
    public Estudia getEstudia(int p){
        return listaEstudia.get(p);
    }
    
    public void setEstudia(Estudia e) {
        listaEstudia.add(e);
    }
    
    public int longitud(){
        return listaEstudia.size();
    }
    
    public void eliminar(int p){
        listaEstudia.remove(p);
    }
    
    public void actualizar(Estudia e, int p){
        listaEstudia.get(p).setIdAlumno(e.getIdAlumno());
        listaEstudia.get(p).setIdAsignatura(e.getIdAsignatura());
        listaEstudia.get(p).setEnsenyanza(e.getEnsenyanza());
        listaEstudia.get(p).setNumCurso(e.getNumCurso());
        listaEstudia.get(p).setGrupo(e.getGrupo());
        listaEstudia.get(p).setCursoEscolar(e.getCursoEscolar());
    }
    
    public void borrar(){
        listaEstudia.clear();
    }
    
}