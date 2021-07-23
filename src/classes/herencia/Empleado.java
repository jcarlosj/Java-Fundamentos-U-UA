package classes.herencia;

// Define clase que hereda de la clase Persona (En Java no existe la herencia multiple)
public class Empleado extends Persona {

    public static int cantidad;        // 0, cero es el valor por defecto para variables del tipo int

    // Atributos de la clase
    private int id;
    private double sueldo;

    // Constructor
    public Empleado( String nombre, double sueldo ) {
        super( nombre );

        this.sueldo = sueldo;
        this .id = ++Empleado .cantidad;
    }

    // Getters and setters
    public int getId() {
        return this .id;
    }

    public double getSueldo() {
        return this .sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        // StringBuilder: Almacena cadenas de caracteres.
        StringBuilder sb = new StringBuilder();

        // StringBuilder: Su tamaño y contenido pueden modificarse. Los objetos de éste tipo son mutables. Esto es una diferencia con los String
        sb .append( getClass() .getSimpleName() ) .append( "[ " );
        sb .append( "id = " ) .append( this .id + ", " );
        sb .append( "sueldo = " ) .append( this .sueldo + ", "  );
        sb .append( super .toString() );        //  Agregamos los datos de la clase padre
        sb .append( " ]" );

        return sb .toString();
    }

}
