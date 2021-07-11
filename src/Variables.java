// 02 Variables: Concatenacion de variables
import java.lang.*;

public class Variables {
    public static void main( String args[] ) throws Exception {
        var i = 4;      // No permite: var i = 4, j = 5;
        var j = 5;
        String name = "Juan";
        String profession = "Desarrollador";

        System .out .println( name + profession );      // JuanDesarrollador
        System .out .println( i + j );                  // 9
        System .out .println( i + j + name );           // 9Juan    Evalua de Izquierda a Derecha
        System .out .println( name + i + j );           // Juan45   Contexto cadena: Si de derecha a izquierda primero encuentra una cadena, todo lo demas lo concaterara como cadena
        System .out .println( name + ( i + j ) );       // Juan9    El contexto cadena se puede romper haciendo uso de los parentesis, aumentando la prioridad en las operaciones dentro de ellos

    }
}
