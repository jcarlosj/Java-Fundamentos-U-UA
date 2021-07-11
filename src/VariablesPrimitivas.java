// 03 Tipos Primitivos: Byte, Short, Int, Long (Casteos)
import java.util.Scanner;

public class VariablesPrimitivas {
    public static void main( String args[] ) throws Exception {
        System .out .println( "" );
        System .out .println( "TIPOS PRIMITIVOS" );

        // ! Define variable de tipo byte
        byte numByte = 127;      //  Valores enteros entre (-128 y 127)
        System .out .println( "Byte\t[ min: " + Byte .MIN_VALUE + ", max: " + Byte .MAX_VALUE + " ]" );

        byte newByte = ( ( byte ) ( numByte + 1 ) );     //  Casteo o conversion de tipo, resultado -128, no 128
        System .out .println( "   numByte: " + numByte + ", newByte: " + newByte );
        System .out .println( "" );

        // ! Define variable de tipo short
        short numShort = -32768;      //  Valores enteros entre (-32768 y 32767)
        System .out .println( "Short\t[ min: " + Short .MIN_VALUE + ", max: " + Short .MAX_VALUE + " ]" );

        short newShort = ( ( short ) ( numShort - 1 ) );     //  Casteo o conversion de tipo, resultado 32767, no -32769
        System .out .println( "   numShort: " + numShort + ", newShort: " + newShort );
        System .out .println( "" );

        // ! Define variable de tipo int
        float numInt = 10;      //  Valores enteros entre (-32768 y 32767)
        int otherNumInt = ( ( int ) 2147483648L );     //  Casteo o conversion de tipo. L representa literal de un valor de tipo 'long' (64 bits) forzado a convertirse en 'int' (32 bits)
        System .out .println( "Int\t[ min: " + Integer .MIN_VALUE + ", max: " + Integer .MAX_VALUE + " ]" );

        int newInt = ( ( int ) numInt );     //  Casteo o conversion de tipo, resultado 32767, no -32769
        System .out .println( "   numInt: " + numInt + ", newInt: " + newInt + ", otherNumInt: " + otherNumInt );
        System .out .println( "" );

        // ! Define variable de tipo long
        long numLong = 10;      //  Valores enteros entre (-32768 y 32767)
        System .out .println( "Long\t[ min: " + Long .MIN_VALUE + ", max: " + Long .MAX_VALUE + " ]" );

        long newLong = ( ( long ) 9223372036854775808F );     //  Casteo o conversion de tipo, en este caso se sobre pasa el valor soportado por los tipos enteros, por lo que podemos usar el literal F que representa literal de un valor de tipo 'float' (32 bits) forzado a convertirse en 'long' (64 bits)
        System .out .println( "   numLong: " + numLong + ", newLong: " + newLong );
        System .out .println( "" );

       
    }
}
