package modeloAlumno;

public class Alumno {

    private int idAlumno;
    private int nia;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String genero;
    private int tipo;
    private String motivoBeca;
    private String observaciones;
    
    public Alumno() {}
    
    public Alumno(int idAlumno, int nia, String nombre, String apellido1, 
            String apellido2, String genero, int tipo, String motivoBeca, 
            String observaciones){
        
        this.idAlumno = idAlumno;
        this.nia = nia;
        this.nombre = nombre; 
        this.apellido1 = apellido1; 
        this.apellido2 = apellido2; 
        this.genero = genero;
        this.tipo = tipo; 
        this.motivoBeca = motivoBeca;
        this.observaciones = observaciones;
    }
    
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getMotivoBeca() {
        return motivoBeca;
    }

    public void setMotivoBeca(String motivoBeca) {
        this.motivoBeca = motivoBeca;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
