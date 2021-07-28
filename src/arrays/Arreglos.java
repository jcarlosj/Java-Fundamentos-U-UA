package arrays;

public class Arreglos {

    public static void inicializado() {
        String fruta = "Lulo";
        String frutas [] = { "Mandarina", "Mango", fruta ,"Mora" };         // Sintaxis resumida

        System.out.println( " ==== Arreglos: valores por defecto ==== " );
        for ( String nombre : frutas ) {
            System.out.println( nombre );
        }
        System.out.println( "" );
    }

    public static void tipoObjeto() {
        Persona personas[] = new Persona[ 3 ];

        // ! Modificamos el valor del objeto que por defecto sera null
        personas[ 0 ] = new Persona( "Juan" );
        personas[ 1 ] = new Persona( "Sofia" );

        System.out.println( " ==== Arreglos de tipo referenciado ==== " );
        for ( Persona p : personas ) {
            System.out.println( p );
        }
        System.out.println( "" );

    }

    public static void tipoPrimitivo() {
        int[] edades = new int[ 3 ];        // Define dimension del Array, en Java los Arrays son estaticos, es decir no pueden crecer dinamicamente

        System.out.println( " ==== Arreglos de tipo primitivo ==== " );
        System.out.println( "edades" + edades );

        // ? Iteramos los valores del array
        System.out.print( "Elementos: " );
        for( int value : edades ) {
            System.out.print( value + " " );
        }
        System.out.println( "" );

        // ! Modificamos el valor de uno de los indices del array
        edades[ 0 ] = 9;

        // ? Iteramos los valores del array
        System.out.print( "Elementos: " );
        for( int value : edades ) {
            System.out.print( value + " " );
        }
        System.out.println( "" );

        try {
            // ! Modificamos el valor de un indice que no existe en el array
            edades[ 3 ] = 10;
        }
        catch ( Exception e ) {
            System.out.println( "No se puede insertar un valor en un indice que no existe" );
        }
        System.out.println( "" );

    }
}
