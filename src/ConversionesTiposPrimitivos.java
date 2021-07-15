public class ConversionesTiposPrimitivos {
    public static void main(String[] args) {
        convertStringToInteger();
        convertStringToFloat();
        convertStringToDouble();
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
