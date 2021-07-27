package testing;

//import com.github.jcarlosj.*;                           // Para la forma 1: usando import tradicional
//import static com.github.jcarlosj.Utileria.imprimir;    // Para la forma 2: usando import static

public class TestUtileria {
    public static void main( String args[] ) throws Exception {
        //Utileria .imprimir( "Juan" );       // Para la forma 1: usando import tradicional
        //imprimir( "Elisa" );                // Para la forma 2: usando import static
        com.github.jcarlosj.Utileria.imprimir( "Juliana" );     // Para la forma 3: usando el nombre completamente calificado
    }
}
