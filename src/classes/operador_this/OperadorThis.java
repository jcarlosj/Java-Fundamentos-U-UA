package classes.operador_this;

public class OperadorThis {
    public static void main( String args[] ) {
        Persona p1 = new Persona( "Ana Maria", "Castro" );
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
        this .nombres = nombres;
        this.apellidos = apellidos;
    }
}
