package classes.herencia;

public class Persona {
    // Atributos de clase
    protected String nombres;
    protected String apellidos;
    protected char genero;
    protected String direccion;
    protected int edad;

    // Constructor
    public Persona() {}

    // Sobrecarga del Constructor
    public Persona( String nombres ) {
        this .nombres = nombres;
    }

    // Sobrecarga del Constructor
    public Persona( String nombres, String apellidos, char genero, String direccion, int edad ) {
        this .nombres = nombres;
        this .apellidos = apellidos;
        this .genero = genero;
        this .direccion = direccion;
        this .edad = edad;
    }

    // Getters & setters
    public String getNombres() {
        return this .nombres;
    }

    public void setNombres( String nombres ) {
        this .nombres = nombres;
    }

    public String getApellidos() {
        return this .apellidos;
    }

    public void setApellidos( String apellidos ) {
        this .apellidos = apellidos;
    }

    public char getGenero() {
        return this .genero;
    }

    public void setGenero( char genero ) {
        this.genero = genero;
    }

    public String getDireccion() {
        return this .direccion;
    }

    public void setDireccion( String direccion ) {
        this .direccion = direccion;
    }

    public int getEdad() {
        return this .edad;
    }

    public void setEdad( int edad ) {
        this .edad = edad;
    }

    @Override
    public String toString() {
        return getClass() .getSimpleName() + ": [ apellidos=" + apellidos + ", direccion=" + direccion + ", edad=" + edad + ", genero=" + genero + ", nombres=" + nombres + " ]";
    }

}

