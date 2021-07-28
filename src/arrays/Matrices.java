package arrays;

public class Matrices {

    public static void imprimir( Object matriz[][] ) {
        // ? Iteramos los valores del array (foreach)
        System.out.println( "Elementos: " );
        for( Object[] filas : matriz ) {
            for( Object value : filas ) {
                System.out.print( "   " + value + " " );
            }
            System.out.println( "" );
        }
    }

    public static void imprimir( int matriz[][] ) {
        // ? Iteramos los valores del array (foreach)
        System.out.println( "Elementos: " );
        for( int[] filas : matriz ) {
            for( int value : filas ) {
                System.out.print( value + " " );
            }
            System.out.println( "" );
        }
    }

    public static void tipoObjeto() {
        Persona personas[][] = new Persona[ 3 ][ 2 ];

        System.out.println( " ==== Matriz: de tipo referenciado ==== " );
        System.out.println( "personas: " + personas );

        imprimir( personas );

        // ! Modificamos el valor del objeto que por defecto sera null
        personas[ 0 ][ 1 ] = new Persona( "Juan" );
        personas[ 1 ][ 0 ] = new Persona( "Sofia" );

        imprimir( personas );

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

        imprimir( todasLasFrutas );

    }

    public static void tipoPrimitivo() {
        int[][] numeros = new int[ 3 ][ 2 ];    // Define filas/columnas de la matriz

        System.out.println( " ==== Matriz: de tipo primitivo ==== " );
        System.out.println( "numeros: " + numeros );

        imprimir( numeros );

        // ! Modificamos el valor de uno de los indices del array
        numeros[ 1 ][ 1 ] = 9;
        numeros[ 2 ][ 0 ] = 3;

        imprimir( numeros );

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
