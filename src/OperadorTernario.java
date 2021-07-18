public class OperadorTernario {
    public static void main( String args[] ) {
        int a = 3, b = 2;
        boolean result;

        result = ( a > b ) ? true : false;
        System.out.println( "a > b: " + result );

        String msg = ( a > b ) ? "verdadero" : "falso";
        System.out.println( "a > b: " + msg );

        msg = ( a > b ) ? "a es menor que b" : "a NO es menor que b";
        System.out.println( "a > b: " + msg );

        char letter = ( a > b ) ? verdadero() : falso();
        System.out.println( "a > b: " + letter );
    }

    public static char verdadero() {
        return 'V';
    }

    public static char falso() {
        return 'F';
    }
}
