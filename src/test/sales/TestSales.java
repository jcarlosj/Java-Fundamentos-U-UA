package test.sales;

import sales.*;

public class TestSales {
    public static void main( String args[] ) throws Exception {
        Order order1 = new Order();
        order1 .showOrder();
        order1 .add( new Product( "Menta", 100 ) );
        order1 .add( new Product( "Colombina", 500 ) );
        order1 .add( new Product( "Pastelito", 1300 ) );
        order1 .showOrder();

    }
}
