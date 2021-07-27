package classes.modificador_final;
public class Final {
    public static void main(String[] args) throws Exception {
        // modificador final en variables o atributos
        final int edad = 29;            // Define una constante
        System.out.println( "edad: " + edad );

        System.out.println( "Atributo estatico de la clase Persona: " + Persona .CANTIDAD );

        final Persona p1 = new Persona();
        // Person p1 = new Persona();           // No se podria asignar (o modificar la referencia al objeto), ya que en la linea anterior, definimos p1 como constante al usar el modificador 'final' en su definicion

        System.out.println( "Nombre de p1: " + p1 .getNombre() );

        // Sin embargo si podemos modificar el valor de sus atributos
        p1 .setNombre( "Juan" );
        System.out.println( "Nombre de p1: " + p1 .getNombre() );
    }
}
