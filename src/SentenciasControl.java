import java.util.Scanner;

public class SentenciasControl {
    public static void main( String args[] ) {
        estacionDelAno();
    }

    public static void estacionDelAno() {
        Scanner sc = new Scanner( System .in );
        var estacion = "Desconocida";

        System.out.print( "Digite el numero del mes deseado: " );
        var mes = sc .nextInt();

        if( mes > 0 && mes <= 12 ) {

            if ( mes == 1 || mes == 2 || mes == 12 ) {
                estacion = "Invierno";
            }
            else if ( mes == 3 || mes == 4 || mes == 5 ) {
                estacion = "Primavera";
            }
            else if ( mes == 6 || mes == 7 || mes == 8 ) {
                estacion = "Verano";
            }
            else if ( mes == 9 || mes == 10 || mes == 11 ) {
                estacion = "Otono";
            }
        }

        System .out .println( "Estacion: " + estacion );

    }
}
