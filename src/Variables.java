// 02 Variables: Clase Scanner (Entrada de datos por terminal)
import java.util.Scanner;

public class Variables {
    public static void main( String args[] ) throws Exception {
        //  Scanner es la clase que nos permitira obtener entradas de datos por la terminal
        Scanner sc = new Scanner( System .in );         //  System clase de Java que nos permite accede a la terminal a traves de in

        System .out .print( "Ingrese su nombre: " );
        var nombre = sc .nextLine();                    //  nextLine: Lee una linea completa de la terminal

        System .out .print( nombre + " que profesion tienes: " );
        var profesion = sc .nextLine();                 //  nextLine: Lee una linea completa de la terminal
        System .out .println( "Wow! " + nombre + "\nEres " + profesion + ", sensacional." );
    }
}
