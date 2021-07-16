import java.util.Scanner;

public class ConversionesTiposPrimitivos {
    public static void main(String[] args) {
        // convertStringToInteger();
        // convertStringToFloat();
        // convertStringToDouble();
        // convertStringToIntegerUsingScanner();
        convertStringToFloatUsingScanner();
    }

    public static void convertStringToFloatUsingScanner() {
        var sc = new Scanner( System .in );

        System.out.print( "Digite un numero decimal: " );
        var valorIngresado1 = sc .nextFloat();
        System .out .printf( "valor ingresado es = %f es de tipo %s \n", valorIngresado1, type( valorIngresado1 ) );

        System.out.print( "Digite otro numero decimal: " );
        var valorIngresado2 = sc .next();
        System .out .printf( "valor ingresado es = %s es de tipo %s \n", valorIngresado2, type( valorIngresado2 ) );

        var valorConvertido = Float.parseFloat( valorIngresado2 );
        System .out .printf( "valor convertido es = %f es de tipo %s \n", valorConvertido, type( valorConvertido ) );

    }

    public static void convertStringToIntegerUsingScanner() {
        var sc = new Scanner( System .in );

        System.out.print( "Digite un numero entero: " );
        var valorIngresado1 = sc .nextInt();
        System .out .printf( "valor ingresado es = %d es de tipo %s \n", valorIngresado1, type( valorIngresado1 ) );

        System.out.print( "Digite otro numero entero: " );
        var valorIngresado2 = sc .next();
        System .out .printf( "valor ingresado es = %s es de tipo %s \n", valorIngresado2, type( valorIngresado2 ) );

        var valorConvertido = Integer.parseInt( valorIngresado2 );
        System .out .printf( "valor convertido es = %d es de tipo %s \n", valorConvertido, type( valorConvertido ) );

    }

    public static void convertStringToInteger() {
        // Convertir String a Integer
        System .out .println( "----- Convertir String a Integer -----" );

        var edadCadena = "43";
        var edadEntera = Integer .parseInt( edadCadena );

        System .out .printf( "edadCadena = %s, es de tipo %s \n", edadCadena, type( edadCadena ) );
        System .out .printf( "edadEntera = %d, es de tipo %s \n", edadEntera, type( edadEntera ) );

    }

    public static void convertStringToFloat() {
        // Convertir String a Integer
        System .out .println( "----- Convertir String a Float -----" );

        var edadCadena = "43F";
        var edadFlotante = Float.parseFloat( edadCadena );

        System .out .printf( "edadCadena = %s, es de tipo %s \n", edadCadena, type( edadCadena ) );
        System .out .printf( "edadEntera = %f, es de tipo %s \n", edadFlotante, type( edadFlotante ) );

    }

    public static void convertStringToDouble() {
        // Convertir String a Integer
        System .out .println( "----- Convertir String a Double -----" );

        var edadCadena = "43";
        var edadDouble = Double .parseDouble( edadCadena );

        System .out .printf( "edadCadena = %s, es de tipo %s \n", edadCadena, type( edadCadena ) );
        System .out .printf( "edadEntera = %f, es de tipo %s \n", edadDouble, type( edadDouble ) );

    }

    //  Obtenemos el tipo de valor que posee la variable
    public static String type( Object value ) {
        return( ( Object ) value ) .getClass() .getSimpleName();
    }
}
