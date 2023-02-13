package escape;

import java.io.Serializable;

public class Alumno implements Serializable {
    private long idAlumno;
    private String apellidos;
    private int edad;
    private String nombre;
    private String repetidor;

    public Alumno(long idAlumno, String apellidos, int edad, String nombre, String repetidor) {
        this.idAlumno = idAlumno;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nombre = nombre;
        this.repetidor = repetidor;
    }

    public Alumno(){

    }

    public long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRepetidor() {
        return repetidor;
    }

    public void setRepetidor(String repetidor) {
        this.repetidor = repetidor;
    }
}