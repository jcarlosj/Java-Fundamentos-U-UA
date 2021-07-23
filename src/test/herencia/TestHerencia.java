package test.herencia;

import classes.herencia.Empleado;

public class TestHerencia {
    public static void main( String[] args ) throws Exception {
        Empleado e1 = new Empleado( "Juan", 9000 );
        Empleado e2 = new Empleado( "Germán", 12000 );

        System.out.println( e1 );           //  Obtenemos detalle de la clase
        System.out.println( e2 );           //  Obtenemos detalle de la clase
    }
}
