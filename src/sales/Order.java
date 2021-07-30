package sales;

public class Order {
    // Atributos estaticos
    private static int counter;
    private static final int MAXIMUM_QUANTITY = 10;

    // Atributos
    private int id;
    private Product products[];
    private int totalProducts;

    public Order() {
        this .products = new Product[ Order .MAXIMUM_QUANTITY ];
        this .id = ++ Order .counter;
    }

    public void add( Product product ) {

        if( this .totalProducts < Order .MAXIMUM_QUANTITY ) {
            this .products[ this .totalProducts++ ] = product;
        }
        else {
            System.out.println( "Se ha superado el # de productos permitidos que es: " + Order .MAXIMUM_QUANTITY );
        }

    }

    public double totalValue() {
        double total = 0;

        for( int i = 0; i < this .totalProducts; i++ ) {
            total += this .products[ i ] .getPrice();
        }

        return total;
    }

    public void showOrder() {
        System .out .println( "===== ID Orden: " + this .id + " =====\nValor Total: $" + this .totalValue() );
        System.out.println( this .totalProducts > 0 ? "Productos: " : "Orden sin productos.." );

        for( int i = 0; i < this .totalProducts; i++ ) {
            System.out.println( this .products[ i ] );
        }

    }
}
