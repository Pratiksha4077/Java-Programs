package Ecommerce;

public class Customer {
    String name;
    int customerId;

    public Customer(String name, int customerId) 
    {
        this.name = name;
        this.customerId = customerId;
    }


    public void displayCustomerInfo() 
    {
        System.out.println("Customer: " + name + ", ID: " + customerId);
    }
}
