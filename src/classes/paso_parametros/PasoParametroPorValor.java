package classes.paso_parametros;

public class PasoParametroPorValor {
    public static void main( String args [] ) {
        int x = 10;
        System.out.println( "x = " + x );

        cambioValor( x );
        System.out.println( "x = " + x );
    }

    // El paso de parametro por valor aplica a los tipos primitivos, es decir, pasa una copia del valor
    public static void cambioValor( int x ) {
        System.out.println( "  x = " + x );
        x += 3;
        System.out.println( "  x = " + x );
    }
}