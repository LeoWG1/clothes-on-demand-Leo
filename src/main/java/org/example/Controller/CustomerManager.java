package org.example.Controller;

import org.example.Model.People.Customer;

public class CustomerManager {
    private final Customer customer;

    public CustomerManager(Customer customer){
        this.customer = customer;
    }

    public void setCustomerData(String name, String streetAddress, String emailAddress){
        customer.setName(name);
        customer.setStreetAddress(streetAddress);
        customer.setEmailAddress(emailAddress);
    }
}
