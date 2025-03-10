package org.example.View;

import org.example.Controller.CustomerManager;
import org.example.Model.People.Customer;

import java.util.Scanner;

public class CustomerView {

    public void displayWelcomeMessage(Scanner customerInput){
        System.out.println("Välkommen till Wigells Webbshop för Kläder!");

        boolean isCustomerDataCorrect = false;
        Customer customer = new Customer();
        CustomerManager customerManager = new CustomerManager(customer);


        while(!isCustomerDataCorrect){
            System.out.println("Vänligen skriv in ditt namn:");
            String name = customerInput.nextLine();

            System.out.println("Vänligen skriv in din adress:");
            String streetAddress = customerInput.nextLine();

            System.out.println("Vänligen skriv in din e-mail adress");
            String emailAddress = customerInput.nextLine();

            System.out.println("Du har skrivit in:");
            displayCustomerData(name, streetAddress, emailAddress);

            System.out.println("Stämmer detta? (Y/N)");
            String answer = customerInput.nextLine();

            if (answer.equalsIgnoreCase("Y")){
                isCustomerDataCorrect = true;
                customerManager.setCustomerData(name, streetAddress, emailAddress);
            } else if (answer.equalsIgnoreCase("N")){
                System.out.println();

            } else {
                System.out.println("Ogiltigt svar. Vänligen skriv Y för ja, eller N för nej");
            }
        }
    }

    private void displayCustomerData(String name, String streetAddress, String emailAddress){
        System.out.println(name);
        System.out.println(streetAddress);
        System.out.println(emailAddress);
    }

}
