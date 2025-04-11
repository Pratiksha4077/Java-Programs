import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.Order;

public class EcommerceSystem 
{
    public static void main(String[] args) 
    {
        
        Product product1 = new Product("Laptop", 700.00, 10);
        Product product2 = new Product("Headphones", 50.00, 5);

        Customer customer1 = new Customer("Alice", 101);
        Customer customer2 = new Customer("Bob", 102);


        product1.displayProductInfo();
        product2.displayProductInfo();


        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();


        System.out.println("\nPlacing Orders...");
        Order order1 = new Order(product1, customer1, 2);
        order1.placeOrder();

        Order order2 = new Order(product2, customer2, 6);
        order2.placeOrder();


        System.out.println("\nUpdated Product Details:");
        product1.displayProductInfo();
        product2.displayProductInfo();
    }
}
