public class Ciclos {
    public static void main( String args[] ) {
        cicloWhile();
        cicloDoWhile();
        cicloFor();
        cicloForEach();
        cicloForDobleIteracion();
    }

    public static void cicloForDobleIteracion() {
        System.out.println( "For (doble iteracion)" );

        for( int i = 0, j = 10; i < 11 && j >= 0; i++, j-- ) {
            System.out.println( "  i = " + i + " -  j = " + j );
        }
    }

    public static void cicloForEach() {
        String nombres[] = { "Elisa", "Luisa", "Juliana" };

        System.out.println( "Usando ForEach" );
        for ( String nombre:nombres ) {
            System.out.println( "  " + nombre );
        }

        System.out.println( "Usando For" );
        for ( int i = 0; i < nombres .length; i++ ) {
            System.out.println( "  " + nombres[ i ] );
        }
    }

    public static void cicloFor() {

        System.out.println( "For" );
        for( int i = 0; i < 3; i++ ) {
            System.out.println( "  i = " + i );
        }

    }

    public static void cicloDoWhile() {
        var contador = 0;

        System.out.println( "Do While" );
        do {
            System.out.println( "  contador = " + contador );
            contador++;
        } while( contador < 3 );

    }

    public static void cicloWhile() {
        var contador = 0;

        System.out.println( "While" );
        while( contador < 3 ) {
            System.out.println( "  contador = " + contador );
            contador++;
        }
    }
}
