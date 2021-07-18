public class OperadoresRelacionales {
    public static void main( String args[] ) {
        var a = 3;
        var b = 2;

        var result = a > b;
        System.out.println( "a > b: " + result );

        result = a >= b;
        System.out.println( "a >= b: " + result );

        result = a < b;
        System.out.println( "a < b: " + result );

        result = a <= b;
        System.out.println( "a >= b: " + result );

        result = a % 2 == 0;
        System.out.println( "a % 2 == 0: " + result + ( result  ? " (es par)" : " (es impar)" ) );
    }
}
