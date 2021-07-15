public class VariableChar {
    public static void main(String[] args) {
        usandoChar();
        usandoVar();
        excepciones();
    }

    public static void excepciones() {
        System .out .println( "----- Excepciones usando Var -----" );
        int iglyph = '!';
        System .out .println( "iglyph =  " + iglyph );

        var vcode_v2 = 0x0021;
        System .out .println( "vcode_v2 =  " + vcode_v2 );

        int letra = 'J';
        System .out .println( "El valor unicode de la letra J es: " + letra );
    }

    public static void usandoVar () {
        System .out .println( "----- Usando Var -----" );

        // ? Usando el Simbolo equivalente
        var glyph = '!';
        System .out .println( "glyph =  " + glyph );

        // ? Usando el Codigo equivalente
        // ! Forma 1
        var code_v1 = '\u0021';
        System .out .println( "code_v1 = " + code_v1 );

        // ! Forma 2
        var code_v2 = ( char ) 0x0021;
        System .out .println( "code_v2 = " + code_v2 );

        // ? Usando el equivalente Decimal
        var decimal = ( char ) 33;         // Casteo de int a octal
        System .out .println(  "decimal = " + decimal );

        // ? Usando el equivalente Octal
        // ! Forma 1: Usando un entero de entrada
        var octal_1 = ( char ) 041;
        System .out .println( "octal_1 = " + octal_1 );

        // ! Forma 2: Usando una cadena de texto de entrada
        String sOctal = "041";

        // Convierte Octal (base8) a decimal (base 10).
        var iOctal = Integer .parseInt( sOctal, 8 );
        // Castea decimal a su correspondiente valor ASCII.
        var octal_2 = ( char ) iOctal;
        System .out .println( "octal_2 = " + octal_2 ); // Output !
    }


    public static void usandoChar() {
        System .out .println( "----- Usando Char -----" );

        // ? Usando el Simbolo equivalente
        char glyph = '!';
        System .out .println( "glyph =  " + glyph );

        // ? Usando el Codigo equivalente
        // ! Forma 1
        char code_v1 = '\u0021';
        System .out .println( "code_v1 = " + code_v1 );

        // ! Forma 2
        char code_v2 = 0x0021;
        System .out .println( "code_v2 = " + code_v2 );

        // ? Usando el equivalente Decimal
        char decimal = 33;
        System .out .println(  "decimal = " + decimal );

        // ? Usando el equivalente Octal
        // ! Forma 1: Usando un entero de entrada
        int integerOctal = 041;
        char octal_1 = ( char ) integerOctal;

        System .out .println( "octal_1 = " + octal_1 );

        // ! Forma 2: Usando una cadena de texto de entrada
        String sOctal = "041";

        // Convierte Octal (base8) a decimal (base 10).
        Integer iOctal = Integer .parseInt( sOctal, 8 );
        // Castea decimal a su correspondiente valor ASCII.
        char octal_2 = ( char ) iOctal .intValue();
        System .out .println( "octal_2 = " + octal_2 ); // Output !

    }

}

/*  Lista de caracteres unicode.
    Estos se pueden operar por: Codigo (Code), Glifo o Simbolo (Glyph), valor decimal (Decimal), valor octal (Octal),
    Ref: 
        https://en.wikipedia.org/wiki/List_of_Unicode_characters#Control_codes
        https://en.wikipedia.org/wiki/List_of_Unicode_characters#Basic_Latin
*/
