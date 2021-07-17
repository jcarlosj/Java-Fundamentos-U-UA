public class OperadoresIgualdad {
    public static void main( String args[] )  throws Exception {
        var a = 2;
        var b = 3;

        // Igual a
        var c = ( a == b );
        System .out .println( "c = " + c );

        // Diferente de
        var d = a != b;
        System .out .println( "d = " + d );

        var saludo = "Hola";
        var despedida = "Adios";

        var referencia = saludo == despedida;               //  Cuando se usa == entre objetos, compara las referencias de memoria que almacena el dato
        System .out .println( "referencia: " + referencia );

        var valores = saludo .equals( despedida );          //  Cuando se usa equals entre objetos, compara los valores almacenados por cada uno de los objetos
        System .out .println( "valores: " + valores );

        saludo = "Adios";
        referencia = saludo == despedida;               //  Cuando se usa == entre objetos, compara las referencias de memoria que almacena el dato
        System .out .println( "referencia: " + referencia );

        valores = saludo .equals( despedida );          //  Cuando se usa equals entre objetos, compara los valores almacenados por cada uno de los objetos
        System .out .println( "valores: " + valores );

    }
}
