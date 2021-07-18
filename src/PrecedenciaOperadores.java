public class PrecedenciaOperadores {
    public static void main( String args[] ) {
        int x = 5, y = 10;
        var z = ++x + y--;

        System.out.println( "x: " + x + "\ny: " + y + "\nz: " + z );

        var operacion = 4 + 5 * 6 / 3;              // El calculo se realiza de izquierda a derecha teniendo en cuenta la precendencia de operadores de Java
        System.out.println( "operacion: " + operacion );
    }
}
