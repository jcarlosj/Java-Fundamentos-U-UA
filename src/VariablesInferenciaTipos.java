public class VariablesInferenciaTipos {

    public static void main( String args[] ) throws Exception {
        // Java infiere el tipo de una variable solo cuando se define con la palabra clave 'var'
        var valorInteger = 10;
        System .out .printf( "El valor %d es de tipo %s \n", valorInteger, type( valorInteger ) );

        var valorFloat = 10.0F;
        System .out .printf( "El valor %.2f es de tipo %s \n", valorFloat, type( valorFloat ) );

        var valorDoble = 10.0;
        System .out .printf( "El valor %.2f es de tipo %s \n", valorDoble, type( valorDoble ) );

        var valorString = "Sofia";
        System .out .printf( "El valor %s es de tipo %s \n", valorString, type( valorString ) );

        var valorChar = 'J';
        System .out .printf( "El valor %c es de tipo %s \n", valorChar, type( valorChar ) );

        var valorBoolean = true;
        System .out .printf( "El valor %b es de tipo %s \n", valorBoolean, type( valorBoolean ) );

    }

    //  Obtenemos el tipo de valor que posee la variable
    public static String type( Object value ) {
        return( ( Object ) value ) .getClass() .getSimpleName();
    }
}

/*  List of conversion characters that you may use in the printf
    %d – for signed decimal integer
    %f – for the floating point
    %o – octal number
    %c – for a character
    %s – a string
    %i – use for integer base 10
    %u – for unsigned decimal number
    %x – hexadecimal number
    %% – for writing % (percentage)
    %n – for new line = \n
*/