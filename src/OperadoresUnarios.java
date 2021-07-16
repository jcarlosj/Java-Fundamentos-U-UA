public class OperadoresUnarios {
    public static void main( String args[] ) throws Exception {

        // ! Operador Unario de cambio de signo
        var a = 3;
        var b = - a;        // Usamos operador unario de cambio de signo
        System .out .println( "Cambia el signo" );
        System .out .println( "  a: " + a + ", b: " + b );

        // ! Operador Unario de cambio de negacion
        var estaDisponible = true;
        System .out .println( "Cambia niega el valor anterior" );
        System .out .println( "  estaDisponible: " + estaDisponible + ", estaDisponible: " + ! estaDisponible );

        // ! Operador Unario de Preincremento
        int c = 5;
        b = ++c;
        System .out .println( "Preincremento" );
        System .out .println( "  c: " + c + ", b: " + b );


        // ! Operador Unario de Preincremento
        int d = 5;
        b = d++;
        System .out .println( "Postincremento" );
        System .out .println( "  d: " + c + ", b: " + b );

        // ! Operador Unario de Predecremento
        int f = 5;
        b = --f;
        System .out .println( "Predecremento" );
        System .out .println( "  f: " + f + ", b: " + b );


        // ! Operador Unario de Predecremento
        int g = 5;
        b = g--;
        System .out .println( "Postdecremento" );
        System .out .println( "  g: " + g + ", b: " + b );
    }
}
