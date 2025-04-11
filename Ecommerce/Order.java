package Ecommerce;

public class Order 
{
    Product product;
    Customer customer;
    int quantity;

    public Order(Product product, Customer customer, int quantity) 
    {
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
    }


    public void placeOrder() 
    {
        if (product.isAvailable(quantity)) 
	{
            double totalCost = calculateTotalCost();
            product.updateQuantity(quantity);
            System.out.println("Order placed successfully for " + quantity + " unit(s) of '" + product.name + "' by " + customer.name);
            System.out.println("Total Cost: $" + totalCost);
        } 
	else 
	{
            System.out.println("Sorry, insufficient stock for '" + product.name + "'.");
        }
    }


    public double calculateTotalCost() 
    {
        return quantity * product.price;
    }
}
