package testing;

import arrays.Arreglos;
import arrays.Matrices;

public class TestArreglos {
    public static void main( String args[] ) {
        //arreglos();
        matrices();
    }

    public static void matrices() {
        Matrices .tipoPrimitivo();
    }

    public static void arreglos() {
        Arreglos .tipoPrimitivo();
        Arreglos .tipoObjeto();
        Arreglos .inicializado();
    }
}
