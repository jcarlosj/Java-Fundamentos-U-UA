package test.herencia;

import java.util.Date;

import classes.herencia.Empleado;
import classes.herencia.Cliente;

public class TestHerencia {
    public static void main( String[] args ) throws Exception {
        Empleado e1 = new Empleado( "Juan", 9000 );
        Empleado e2 = new Empleado( "Carolina", 12000 );

        System.out.println( e1 );           //  Obtenemos detalle de la clase
        System.out.println( e2 );           //  Obtenemos detalle de la clase

        Cliente c1 = new Cliente( "Ana Maria", "Castro", 'F', "Bogota", 28, new Date(), true );
        Cliente c2 = new Cliente( "Elisa Maria", "Giraldo", 'F', "Medellin", 44, new Date(), true );

        System.out.println( c1 );           //  Obtenemos detalle de la clase
        System.out.println( c2 );           //  Obtenemos detalle de la clase
    }
}
