// 02 Variables: Interferencia de tipos en Java
import java.lang.*;

public class Variables {
    public static void main( String args[] ) throws Exception {
        //  Define variables para inferir sus tipos, sin embargo posee restricciones en su uso (Disponible desde el JDK 10 en adelante)
        var anio = 1996;
        var mensaje = "Fecha del lanzamiento inicial de Java: ";

        //  Define explicitamente las variables
        String mes = "enero";
        int dia = 13;

        dia = 23;

        //  Obtenemos los tipos de datos de las variables usadas
        System .out .println( "anio es: " + ( ( Object ) anio ) .getClass() .getSimpleName() );
        System .out .println( "mensaje es: " + mensaje .getClass() .getSimpleName() );
        System .out .println( "mes es: " + mes .getClass() .getSimpleName() );
        System .out .println( "dia es: " + ( ( Object ) dia ) .getClass() .getSimpleName() +  "\n" );
        //  Despliega el mensaje respectivo
        System .out .println( mensaje + dia + " de " + mes + " de " + anio );

    }
}
