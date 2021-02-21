package modeloVolumen;

import java.io.Serializable;

public class Volumen implements Serializable {

    private int idVolumen;
    private String titulo;
    private String isbn;
    private String editorial; 
    private String coleccion; 
    private int numVolumen;
    private int cantVolumenes; 
    private int numPaginas;
    private String observaciones;
    
    public Volumen() {
//        idVolumen = 0;
//        titulo = "";
//        isbn = "";
//        editorial = "";
//        coleccion = "";
//        numVolumen = 0; 
//        cantVolumenes = 0;
//        numPaginas = 0; 
//        observaciones = "";
    }
    
    public Volumen(int idVolumen, String titulo, String isbn, String editorial, 
            String coleccion, int numVolumen, int cantVolumenes, int numPaginas, 
            String observaciones) {
        this.idVolumen = idVolumen;
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        this.coleccion = coleccion;
        this.numVolumen = numVolumen;
        this.cantVolumenes = cantVolumenes;
        this.numPaginas = numPaginas;
        this.observaciones = observaciones;
    }
    
    public int getIdVolumen() {
        return idVolumen;
    }

    public void setIdVolumen(int idVolumen) {
        this.idVolumen = idVolumen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public int getNumVolumen() {
        return numVolumen;
    }

    public void setNumVolumen(int numVolumen) {
        this.numVolumen = numVolumen;
    }

    public int getCantVolumenes() {
        return cantVolumenes;
    }

    public void setCantVolumenes(int cantVolumenes) {
        this.cantVolumenes = cantVolumenes;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
