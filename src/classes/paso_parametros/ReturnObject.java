package classes.paso_parametros;

import classes.Persona;

public class ReturnObject {
    public static void main( String args[] ) {
        Persona nueva = nuevaPersona( "Elisa", "Giraldo" );
        nueva .desplegarInformacion();

        Persona persona = new Persona();
        cambioValor( persona );
        persona .desplegarInformacion();
    }

    public static Persona nuevaPersona( String nombres, String apellidos ) {
        Persona persona = new Persona();
        persona .nombres = nombres;
        persona .apellidos = apellidos;

        return persona;
    }

    public static Persona cambioValor( Persona persona ) {
        if( persona == null ) {
            return null;
        }

        persona .nombres = "Luisa";
        persona .apellidos = "Bazalar";

        return persona;
    }
}
