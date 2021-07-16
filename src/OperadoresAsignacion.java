public class OperadoresAsignacion {
    public static void main( String args[] ) {
        int a = 3, b = 4, c = 5, d = 6;

        // ? Asignaciones tradicionales
        c = a + c - d;
        System.out.println( "c = " + c );

        // ! Asignaciones con operadores de composicion con la suma
        a += 1;     //  a = a + 1
        System.out.println( "a = " + a );
        a += 3;     //  a = a + 3
        System.out.println( "a = " + a );

        // ! Asignaciones con operadores de composicion con la resta
        a -= 2;     //  a = a - 2
        System.out.println( "a = " + a );

        // ! Asignaciones con operadores de composicion con la multiplicacion
        a *= 2;     //  a = a * 2
        System.out.println( "a = " + a );

        // ! Asignaciones con operadores de composicion con la division
        a /= 2;     //  a = a / 2
        System.out.println( "a = " + a );

        // ! Asignaciones con operadores de composicion con la modulo
        a %= 2;     //  a = a % 2
        System.out.println( "a = " + a );
    }
}
