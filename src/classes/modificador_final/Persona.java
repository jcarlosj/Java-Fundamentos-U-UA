package classes.modificador_final;

// Definimos clase con final para evitar la herencia
public final class Persona {

    // Definimos un atributo constante
    public static final int CANTIDAD = 0;

    // Define otros atributos
    private String nombre;

    // Getters and setters
    public String getNombre() {
        return this .nombre;
    }

    public void setNombre( String nombre ) {
        this .nombre = nombre;
    }


}