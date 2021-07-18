import java.util.Scanner;

public class SentenciasControl {
    public static void main( String args[] ) {
        estacionDelAno_ifElseIf();
        estacionDelAno_Switch();
    }

    public static void estacionDelAno_Switch() {
        System.out.println( "Usando Switch" );
        Scanner sc = new Scanner( System .in );
        var estacion = "";

        System.out.print( "  Digite el numero del mes deseado: " );
        var mes = sc .nextInt();

        switch( mes ) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
            default:
                estacion = "Desconocida";
                break;
        }

        System .out .println( "  Estacion: " + estacion );

    }

    public static void estacionDelAno_ifElseIf() {
        System.out.println( "Usando if-else-if" );
        Scanner sc = new Scanner( System .in );
        var estacion = "Desconocida";

        System.out.print( "  Digite el numero del mes deseado: " );
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
                estacion = "Otonio";
            }
        }

        System .out .println( "  Estacion: " + estacion );

    }
}
