package test.encapsulamiento;

import classes.encapsulamiento.Persona;     // Importa la clase de otro paquete

public class TestPersona {
    public static void main( String args[] ) throws Exception {
        Persona p1 = new Persona( "Elisa", "Giraldo", 9000, false );
        p1 .setNombres( "Elisa Maria" );
        p1 .setSueldo( 11000 );

        // System.out.println( p1. getClass() .getName() );                // Nombre de la clase constructora del objeto
        // System.out.println( " - nombres: " + p1 .getNombres() );
        // System.out.println( " - apellidos: " + p1 .getApellidos() );
        // System.out.println( " - sueldo: " + p1 .getSueldo() );
        // System.out.println( " - eliminado: " + p1 .isEliminado() );

        System.out.println( p1 .toString() );   // Obtenemos el estado de los atributos del objeto
        System.out.println( p1 );               // Incluso podemos omitir la invocacion del metodo
    }
}
