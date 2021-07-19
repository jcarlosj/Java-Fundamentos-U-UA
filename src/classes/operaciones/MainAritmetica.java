package classes.operaciones;

public class MainAritmetica {
    public static void main( String args[] ) {
        Aritmetica calc = new Aritmetica();
        calc .a = 3;
        calc .b = 2;
        calc .sumar();
        System.out.println( "El resultado de la resta: " + calc .restar() );
        calc .multiplicar( 3, 3 );                                                      // El metodo espera recibir dos parametros
        System.out.println( "El resultado de la division: " + calc .dividir( 9, 3 ) );  // El metodo espera recibir dos parametros
        calc .sumar();
    }
}
