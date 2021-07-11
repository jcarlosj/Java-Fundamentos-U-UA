// 03 Tipos Primitivos: Byte
import java.util.Scanner;

public class VariablesPrimitivas {
    public static void main( String args[] ) throws Exception {
        System .out .println( "Tipo primitivo" );

        // Define variable de tipo byte
        byte numByte = 127;      //  Valores enteros entre (-128 y 127)
        System .out .println( "Byte\t[ min: " + Byte .MIN_VALUE + ", max: " + Byte .MAX_VALUE + "]" );

        byte newNumByte = ( ( byte ) ( numByte + 1 ) );     //  Casteo o conversion de tipo, resultado -128, no 128
        System .out .println( "numByte: " + numByte + ", newNumByte: " + newNumByte );
    }
}
