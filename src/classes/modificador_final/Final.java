package classes.modificador_final;

public class Final {
    public static void main(String[] args) throws Exception {
        // modificador final en variables o atributos
        final int edad = 29;            // Define una constante
        System.out.println( "edad: " + edad );

        Empleado empleado = new Empleado();         // The type Empleado cannot subclass the final class Persona
    }
}
