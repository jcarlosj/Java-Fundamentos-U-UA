package arrays;

public class Persona {

    private String nombre;

    public Persona( String nombre ) {
        this .nombre = nombre;
    }

    public boolean getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [ nombre = " + nombre + " ], memoria = " + super .toString();
    }

}
