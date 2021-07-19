package classes.operaciones;

public class Aritmetica {
    // Atributos
    int a, b;       // Su valor por defecto es 0

    // Constructor: Aun al no definirlo Java lo hara automaticamente por nosotros inicializando todos los Atributos de clase de acuerdo a su tipo
    public Aritmetica() {
        System.out.println( "Ejecutando Aritmetica" );
    }

    //  Sobre carga de constructores, el Constructor por defecto no se generara cuando creamos una sobre carga.
    public Aritmetica( int a, int b ) {
        this .a = a;
        this .b = b;
        System.out.println( "Ejecutando Aritmetica (Constructor Sobrecargado)" );
    }

    // Metodo comun
    public void sumar() {
        var resultado = a + b;
        System.out.println( "El resultado de la suma: " + resultado );
    }

    // Metodo que retorna un valor de tipo entero
    public int restar() {
        return a - b;
    }

    // Metodo que recibe dos argumentos
    public void multiplicar( int a, int b ) {
        System.out.println( "El resultado de la multiplicacion: " + ( a * b ) );
    }

    // Metodo que recibe dos argumentos y retorna un valor de tipo entero
    public int[] dividir( int a, int b ) {
        this .a = a;    //  this hace referencia al mismo objeto
        this .b = b;
        return new int[] { this .a / this .b, this .modulo( this .a, this .b ) };
    }

    public int modulo( int a, int b ) {
        return a % b;
    }

}

/* NOTA: Los metodos estaticos no pueden acceder al operador this */
