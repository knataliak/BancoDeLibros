package modeloEstudia;

public class Estudia {
    private int idAlumno;
    private int idAsignatura;
    private String ensenyanza;
    private int numCurso; 
    private String grupo;
    private String cursoEscolar;
    
    public Estudia(){}
    
    public Estudia(int idAlumno, int idAsignatura, String ensenyanza, int numCurso, 
            String grupo, String cursoEscolar){
        this.idAlumno = idAlumno;
        this.idAsignatura = idAsignatura;
        this.ensenyanza = ensenyanza;
        this.numCurso = numCurso;
        this.grupo = grupo;
        this.cursoEscolar = cursoEscolar;
    }
    
     public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getEnsenyanza() {
        return ensenyanza;
    }

    public void setEnsenyanza(String ensenyanza) {
        this.ensenyanza = ensenyanza;
    }

    public int getNumCurso() {
        return numCurso;
    }

    public void setNumCurso(int numCurso) {
        this.numCurso = numCurso;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCursoEscolar() {
        return cursoEscolar;
    }

    public void setCursoEscolar(String cursoEscolar) {
        this.cursoEscolar = cursoEscolar;
    }
}
