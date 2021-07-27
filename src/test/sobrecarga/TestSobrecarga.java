package test.sobrecarga;

import classes.sobrecarga.Operacion;

public class TestSobrecarga {
    public static void main( String[] args ) throws Exception {
        int[] enteros = { 3, 6, 9, 12, 15, 21 };
        double[] decimales = { 0.3, 0.6, 0.9, 0.12, 0.15, 0.21 };

        var totalSumaEntera = Operacion .sumar( 6, 3 );
        System.out.println( "  Suma entera: " + totalSumaEntera );

        totalSumaEntera = Operacion .sumar( enteros );
        System.out.println( "  Suma entera: " + totalSumaEntera );

        var totalSumaDecimal = Operacion .sumar( 6.0, 3.3 );
        System.out.println( "  Suma decimal: " + totalSumaDecimal );

        totalSumaDecimal = Operacion .sumar( decimales );
        System.out.println( "  Suma decimal: " + totalSumaDecimal );

        totalSumaDecimal = Operacion .sumar( 3, 5L );
        System.out.println( "  Suma decimal: " + totalSumaDecimal );

    }
}
