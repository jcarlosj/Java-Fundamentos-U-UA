public class OperadoresAritmeticos {
    public static void main( String args[] ) {
        int a = 3, b = 2;
        var result = 0;

        System .out . println( "Los valores: \n a = " + a + ", b = " + b );

        result = a + b;
        System .out .println( " - Suma: " + result );

        result = a - b;
        System .out .println( " - Resta: " + result );

        result = a * b;
        System .out .println( " - Multiplicacion: " + result );

        result = a / b;
        System .out .println( " - Division: " + result );

        result = a % b;
        System .out .println( " - Modulo: " + result );
    }
}
