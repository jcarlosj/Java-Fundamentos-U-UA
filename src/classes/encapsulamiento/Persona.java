package classes.encapsulamiento;

public class Persona {
    // Atributos de clase con encapsulados con nivel de acceso de privado
    private String nombres;
    private String apellidos;
    private double sueldo;
    private boolean eliminado;

    // Constructor
    public Persona( String nombres, String apellidos, double sueldo, boolean eliminado ) {
        this .nombres = nombres;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    // Getters and setters
    public String getNombres() {
        return nombres;
    }

    public void setNombres( String nombres ) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos( String apellidos ) {
        this.apellidos = apellidos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    // Este metodo los permitira obtener los valores de los atributos como una cadena
    public String toString() {
        return getClass() .getSimpleName() + ": [ nombres: " + this .nombres + ", apellidos: " + this .apellidos + ", sueldo: " + this .sueldo + ", eliminado: " + this .eliminado + " ]";
    }

}
