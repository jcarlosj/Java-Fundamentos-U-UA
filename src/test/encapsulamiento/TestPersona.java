package test.encapsulamiento;

import classes.encapsulamiento.Persona;     // Importa la clase de otro paquete

public class TestPersona {
    public static void main( String args[] ) throws Exception {
        Persona p1 = new Persona( "Elisa", "Giraldo", 9000, false );
        Persona p2 = new Persona( "Luisa", "Bazalar", 9000, false );
        Persona p3 = new Persona( "Juliana", "Puerta", 7000, true );
        p1 .setNombres( "Elisa Maria" );
        p1 .setSueldo( 11000 );

        System.out.println( "Total Personas: " + Persona .cantidad );   // Obtenemos el numero de personas creadas usando el Contexto estatico de la clase

        // Obtenemos los datos de cada persona usando el Contexto dinamico de la clase
        System.out.println( p1 );   // Obtenemos el estado de los atributos del objeto
        System.out.println( p2 );
        System.out.println( p3 );
    }
}
