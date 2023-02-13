package escape;

public class Examen {
    private long idExamen;
    private String fecha;
    private double nota;
    private double idAlumno;
    private double idModul;

    public Examen(long idExamen, String fecha, double nota, double idAlumno, double idModul) {
        this.idExamen = idExamen;
        this.fecha = fecha;
        this.nota = nota;
        this.idAlumno = idAlumno;
        this.idModul = idModul;
    }

    public Examen(){

    }

    public long getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(long idExamen) {
        this.idExamen = idExamen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(double idAlumno) {
        this.idAlumno = idAlumno;
    }

    public double getIdModul() {
        return idModul;
    }

    public void setIdModul(double idModul) {
        this.idModul = idModul;
    }
}
