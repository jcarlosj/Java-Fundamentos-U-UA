public class OperadoresCondicionales {
    public static void main(String[] args) {
        var a = 10;
        var min = 0;
        var max = 10;
        boolean estaEnRango;

        System.out.println( "AND => &&" );
        estaEnRango = a >= min && a <= max;
        System.out.println( "  a >= min && a <= max: " + estaEnRango );
        a = 11;
        estaEnRango = a >= min && a <= max;
        System.out.println( "  a >= min && a <= max: " + estaEnRango );

        System.out.println( "OR => ||" );
        estaEnRango = a >= min || a <= max;
        System.out.println( "  a >= min || a <= max: " + estaEnRango );

    }
}
