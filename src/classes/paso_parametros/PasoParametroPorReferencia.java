package classes.paso_parametros;

import classes.Persona;     // Importamos para hacer uso de una clase en otro paquete

public class PasoParametroPorReferencia {
    public static void main( String args[] ) {
        Persona persona1 = new Persona();
        persona1 .nombres = "Sofia";
        persona1 .apellidos = "Gutierrez";
        persona1 .desplegarInformacion();

        cambioValor( persona1 );
        persona1 .desplegarInformacion();
    }

    // El paso de parametro por referencia aplica a los tipos referenciados u objetos, es decir, pasa el apuntador al objeto o referencia en memoria
    public static void cambioValor( Persona persona ) {
        System.out.println( "===== cambioValor =====" );
        persona .desplegarInformacion();
        persona .nombres = "Eva Sofia Janeth";
        persona .apellidos = "Gutierrez Gonzalez";
        persona .desplegarInformacion();
        System.out.println( "===== FIN cambioValor =====" );
    }
}
