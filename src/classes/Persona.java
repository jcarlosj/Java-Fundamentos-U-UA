package classes;

// Definicion de una clase
public class Persona {
    // Atributos
    public String nombres;
    public String apellidos;

    // Metodos
    public void desplegarInformacion() {
        System.out.println( "Nombre: " + nombres );
        System.out.println( "Apellidos: " + apellidos );
    }
}

// NOTA: Java crea el constructor automaticamente aunque no lo definamos