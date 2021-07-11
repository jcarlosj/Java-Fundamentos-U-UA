// 03 Tipos Primitivos: Float y Double (Literales y Casteos)
import java.util.Scanner;

public class VariablesPrimitivas {
    public static void main( String args[] ) throws Exception {
        System .out .println( "" );
        System .out .println( "TIPOS PRIMITIVOS" );

        // ! Define variable de tipo float
        float numFloat1 = 127;
        float numFloat2 = (float) 3.4028236E38D;     //  Casteo literal Double a Float
        System .out .println( "Float\t[ min: " + Float .MIN_VALUE + ", max: " + Float .MAX_VALUE + " ]" );

        // byte newByte = ( ( byte ) ( numByte + 1 ) );     //  Casteo o conversion de tipo
        System .out .println( "   numFloat1: " + numFloat1 + ", numFloat2: " + numFloat2 );         // numFloat2 = Infinity. Se perdio valor y presicion
        System .out .println( "" );

        // ! Define variable de tipo float
        double numDouble = 10;
        System .out .println( "Double\t[ min: " + Double .MIN_VALUE + ", max: " + Double .MAX_VALUE + " ]" );

        double newDouble = ( ( double ) 1.7976931348623157E308 );     //  Casteo o conversion de tipo
        System .out .println( "   newDouble: " + newDouble + ", numDouble: " + numDouble );
        System .out .println( "" );


    }
}
