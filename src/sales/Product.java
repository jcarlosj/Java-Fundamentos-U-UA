package sales;

public class Product {
    // Atributos estaticos
    private static int counter;

    // Atributos
    private final int ID;
    private String name;
    private double price;

    // Constructor
    private Product() {
        this .ID = ++ Product .counter;
    }

    // Sobrecarga Constructor
    public Product( String name, double price ) {
        this();

        this .name = name;
        this .price = price;
    }

    // Getters and Setters
    public int getId() {
        return this .ID;
    }

    public String getName() {
        return this .name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this .price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        // StringBuilder: Almacena cadenas de caracteres.
        StringBuilder sb = new StringBuilder();

        // StringBuilder: Su tamaño y contenido pueden modificarse. Los objetos de éste tipo son mutables. Esto es una diferencia con los String
        sb .append( "Product: " ) .append( "[ " );
        sb .append( "id = " ) .append( this .ID + ", " );
        sb .append( "name = " ) .append( this .name + ", " );
        sb .append( "price = " ) .append( this .price + ", " );
        sb .append( "memoria = " ) .append( super .toString() );        //  Agregamos los datos de la clase padre (Direccion de memoria)
        sb .append( " ]" );

        return sb .toString();
    }

}
