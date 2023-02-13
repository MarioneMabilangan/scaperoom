package escape;

public class Modulo {
    private long idModulo;
    private String nombre;

    public Modulo(long idModulo, String nombre) {
        this.idModulo = idModulo;
        this.nombre = nombre;
    }

    public Modulo(){

    }

    public long getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(long idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
