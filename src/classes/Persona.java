package classes;

// Definicion de una clase
public class Persona {
    // Atributos
    String nombres;
    String apellidos;

    // Metodos
    public void desplegarInformacion() {
        System.out.println( "Nombre: " + nombres );
        System.out.println( "Apellidos: " + apellidos );
    }
}

// NOTA: Java crea el constructor automaticamente aunque no lo definamos