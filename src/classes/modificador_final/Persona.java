package classes.modificador_final;

public class Persona {

    // Define un metodo como final: Indicará que este no puede sobre escribirse desde la clase hija
    public final void imprimir( String value ) {
        System.out.println( "value: " + value );
    }

}