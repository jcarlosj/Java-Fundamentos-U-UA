package arrays;

public class Matrices {

    public static void tipoObjeto() {
        Persona personas[][] = new Persona[ 3 ][ 2 ];

        System.out.println( " ==== Matriz: de tipo referenciado ==== " );
        System.out.println( "personas: " + personas );

        // ? Iteramos los valores del array (foreach)
        System.out.println( "Elementos: " );
        for( Persona[] filas : personas ) {
            //System.out.print( filas + " " );
            for( Persona value : filas ) {
                System.out.print( value + " " );
            }
            System.out.println( "" );
        }

        // ! Modificamos el valor del objeto que por defecto sera null
        personas[ 0 ][ 1 ] = new Persona( "Juan" );
        personas[ 1 ][ 0 ] = new Persona( "Sofia" );

        // ? Iteramos los valores del array (forma tradicional)
        System.out.println( "Elementos: " );
        for( int i = 0; i < personas.length; i++ ) {
            for( int j = 0; j < personas[ i ] .length; j++ ) {
                System.out.print( personas[ i ][ j ] + " " );
            }
            System.out.println( "" );
        }


    }

    public static void inicializado() {
        System.out.println( " ==== Matriz: valores por defecto ==== " );

        String fruta = "Lulo";
        String frutas[] = { "Sandia", "Banano", "Lima" };
        String todasLasFrutas[][] = {
            { "Mandarina", "Mango", fruta ,"Mora", "Piña" },
            frutas,
            { "Naranja", fruta ,"Fresa", "Limon" }
        };         // Sintaxis resumida

        // ? Iteramos los valores del array (forma tradicional)
        System.out.println( "Elementos: " );
        for( int i = 0; i < todasLasFrutas.length; i++ ) {
            for( int j = 0; j < todasLasFrutas[ i ] .length; j++ ) {
                System.out.print( todasLasFrutas[ i ][ j ] + " " );
            }
            System.out.println( "" );
        }

    }

    public static void tipoPrimitivo() {
        int[][] numeros = new int[ 3 ][ 2 ];    // Define filas/columnas de la matriz

        System.out.println( " ==== Matriz: de tipo primitivo ==== " );
        System.out.println( "numeros: " + numeros );

        // ? Iteramos los valores del array (foreach)
        System.out.println( "Elementos: " );
        for( int[] filas : numeros ) {
            //System.out.print( filas + " " );
            for( int value : filas ) {
                System.out.print( value + " " );
            }
            System.out.println( "" );
        }

        // ! Modificamos el valor de uno de los indices del array
        numeros[ 1 ][ 1 ] = 9;
        numeros[ 2 ][ 0 ] = 3;

        // ? Iteramos los valores del array (forma tradicional)
        System.out.println( "Elementos: " );
        for( int i = 0; i < numeros.length; i++ ) {
            for( int j = 0; j < numeros[ i ] .length; j++ ) {
                System.out.print( numeros[ i ][ j ] + " " );
            }
            System.out.println( "" );
        }

        try {
            // ! Modificamos el valor de un indice que no existe en el array
            numeros[ 3 ][ 3 ] = 10;
        }
        catch ( Exception e ) {
            System.out.println( "No se puede insertar un valor en un indice que no existe" );
        }
        System.out.println( "" );
    }
}
