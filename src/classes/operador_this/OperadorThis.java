package classes.operador_this;

public class OperadorThis {
    public static void main( String args[] ) {
        Persona p1 = new Persona( "Ana Maria", "Castro" );
        System.out.println( "p1:   " + p1 );
        System.out.printf( "Hola, %s %s \n", p1 .nombres, p1 .apellidos );
    }
}

// Toda clase que se agregue al mismo archivo no pueden ser publicas por lo que solo pueden ser accedidas desde este mismo archivo
// La generalidad indica que cuando no se le coloca el nivel de acceso a la clase por defecto es Default o Package, excepto para este caso
class Persona {
    String nombres;
    String apellidos;

    // La generalidad indica que cuando no se le coloca el nivel de acceso del Constructor por Default es Public o Package, en tal caso solo podra ser accedido desde clases del mismo paquete
    Persona( String nombres, String apellidos ) {
        // super();     Aunque no lo veamos aqui hay un a llamada implicita al constructor de la clase padre que en Java es Object
        this .nombres = nombres;
        this.apellidos = apellidos;
        System.out.println( "this: " + this );      // Hace referencia a la clase actual (Persona)

        new Imprimir() .imprimir( this );
    }
}

class Imprimir {

    public void imprimir( Persona p2 ) {
        System.out.println( "p2:   " + p2 );
        System.out.println( "this: " + this );      // Hace referencia a la clase actual (Imprimir)
    }
}