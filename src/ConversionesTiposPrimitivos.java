import java.util.Scanner;

public class ConversionesTiposPrimitivos {
    public static void main(String[] args) {
        // convertStringToInteger();
        // convertStringToFloat();
        // convertStringToDouble();
        // convertNumbersToString();
        // convertStringToIntegerUsingScanner();
        // convertStringToFloatUsingScanner();
        // convertStringToDoubleUsingScanner();
        extractCharacters();
    }

    public static void extractCharacters () {
        Scanner sc = new Scanner( System.in );

        char letter = "Hola amigos!" .charAt( 3 );       // Obtiene el caracter en la posicion 3 de la cadena
        System .out .println( letter );

        //  Iteramos la una cadena posicion por posicion
        String mensaje = "Bienvenidos a Java!";

        for( int i = 0; i < mensaje.length(); i++ ) {
            System .out .print( mensaje .charAt( i ) + "|" );
        }

        System .out .println( "" );

        System .out .print( "Digite un caracter: " );
        char character = sc .nextLine() .charAt( 0 );

        System .out .printf( "Has digitado: %c \n", character );
    }

    public static void convertNumbersToString() {
        int edad = 43;
        var edadConvertida =  String .valueOf( edad );
        System .out .println( "----- Convertir Integer a String -----" );
        System .out .printf( "valor original es = %d es de tipo %s \n", edad, type( edad ) );
        System .out .printf( "valor convertido es = %s es de tipo %s \n", edadConvertida, type( edadConvertida ) );

        float altura = 1.67F;
        var alturaConvertida =  String .valueOf( altura );
        System .out .println( "----- Convertir Float a String -----" );
        System .out .printf( "valor original es = %f es de tipo %s \n", altura, type( altura ) );
        System .out .printf( "valor convertido es = %s es de tipo %s \n", alturaConvertida, type( alturaConvertida ) );

        double pi = Math .PI;
        var piConvertido =  String .valueOf( pi );
        System .out .println( "----- Convertir Double a String -----" );
        System .out .printf( "valor original es = %f es de tipo %s \n", pi, type( pi ) );
        System .out .printf( "valor convertido es = %s es de tipo %s \n", piConvertido, type( piConvertido ) );
    }

    public static void convertStringToDoubleUsingScanner() {
        var sc = new Scanner( System .in );

        System.out.print( "Digite un numero de doble presicion: " );
        var valorIngresado1 = sc .nextDouble();
        System .out .printf( "valor ingresado es = %f es de tipo %s \n", valorIngresado1, type( valorIngresado1 ) );

        System.out.print( "Digite otro numero de doble presicion: " );
        var valorIngresado2 = sc .next();
        System .out .printf( "valor ingresado es = %s es de tipo %s \n", valorIngresado2, type( valorIngresado2 ) );

        var valorConvertido = Double.parseDouble( valorIngresado2 );
        System .out .printf( "valor convertido es = %f es de tipo %s \n", valorConvertido, type( valorConvertido ) );

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
