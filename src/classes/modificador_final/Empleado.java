package classes.modificador_final;

public class Empleado extends Persona {

    // Este metodo no sera permitido debido a que al implementar el modificador 'final' en el mismo metodo de la clase padre impide que pueda se reescrito
    public void imprimir( value ) {
        System.out.println( "Hola " + value );
    }

}