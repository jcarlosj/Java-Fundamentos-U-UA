package classes;

public class MainPersona {
    public static void main( String args[] ) {
        Persona persona_1;

        persona_1 = new Persona();                  //  Intanciacion: Creacion de un objeto a partir de una clase
        persona_1 .nombres = "Juan Carlos";         //  Se puede acceder por que es publico
        persona_1 .apellidos = "Jimenez Gutierrez"; //  Se puede acceder por que es publico
        persona_1 .desplegarInformacion();          //  Se puede acceder por que es publico

        Persona persona_2 = new Persona();                  //  Intanciacion: Creacion de un objeto a partir de una clase
        System.out.println( "Persona 1: " + persona_1 );    //  Persona 1: classes.Persona@4b1210ee
        System.out.println( "Persona 2: " + persona_2 );    //  Persona 2: classes.Persona@4d7e1886

        persona_2 .desplegarInformacion();          //  Se puede acceder por que es publico
    }
}
