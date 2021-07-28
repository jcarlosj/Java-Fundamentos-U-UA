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
        Matrices .inicializado();
        Matrices .tipoObjeto();
    }

    public static void arreglos() {
        Arreglos .tipoPrimitivo();
        Arreglos .tipoObjeto();
        Arreglos .inicializado();
    }
}
