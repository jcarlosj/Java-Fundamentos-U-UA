package arrays;

public class Arreglos {
    public static void main( String args[] ) throws Exception {
        arregloTipoPrimitivo();
    }

    public static void arregloTipoPrimitivo() {
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

    }
}
