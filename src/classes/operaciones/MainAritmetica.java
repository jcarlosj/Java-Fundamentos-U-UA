package classes.operaciones;

public class MainAritmetica {
    public static void main( String args[] ) {
        System.out.println( "Instancia con el constructor por defecto" );
        Aritmetica calc = new Aritmetica();
        calc .a = 3;
        calc .b = 2;
        calc .sumar();
        System.out.println( "El resultado de la resta: " + calc .restar() );
        calc .multiplicar( 3, 3 );                          // El metodo espera recibir dos parametros
        int resultado[] = calc .dividir( 9, 3 );            // El metodo espera recibir dos parametros
        System.out.println( "El resultado de la division: " + resultado[ 0 ] );
        System.out.println( "El resultado del modulo: " + resultado[ 1 ] );
        calc .sumar();

        // Creamos una instancia usando el constructor sobrecargado
        System.out.println( "Instancia con el constructor sobrecargado" );
        Aritmetica calc_1 = new Aritmetica( 9, 7 );
        calc_1 .sumar();
        System.out.println( "El resultado de la resta: " + calc_1 .restar() );
    }
}
