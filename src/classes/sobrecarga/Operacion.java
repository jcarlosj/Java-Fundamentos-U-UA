package classes.sobrecarga;

public class Operacion {

    public static int sumar( int num1, int num2 ) {
        System.out.println( "Invoca: sumar( int num1, int num2 )" );

        return num1 + num2;
    }

    // Sobrecarga 1 del metodo sumar
    public static double sumar( double num1, double num2 ) {
        System.out.println( "Invoca: sumar( double num1, double num2 )" );

        return num1 + num2;
    }

    // Sobrecarga 2 del metodo sumar
    public static int sumar( int [] numeros ) {
        int total = 0;
        for( int value : numeros ) {
            total += value;
        }

        System.out.println( "Invoca: sumar( int [] numeros )" );

        return total;
    }

    // Sobrecarga 3 del metodo sumar
    public static double sumar( double [] numeros ) {
        double total = 0;
        for( double value : numeros ) {
            total += value;
        }

        System.out.println( "Invoca: sumar( double [] numeros )" );

        return total;
    }

}
