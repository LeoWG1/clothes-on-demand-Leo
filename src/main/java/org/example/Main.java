package org.example;

import org.example.View.CustomerView;
import org.example.View.OrderView;

import java.util.Scanner;

public class Main
{

    public static void main( String[] args ) {
        Scanner customerInput = new Scanner(System.in);
        CustomerView customerView = new CustomerView();
        OrderView orderView = new OrderView();


        customerView.displayWelcomeMessage(customerInput);
        orderView.displayProducts(customerInput);

        customerInput.close();
    }
}
