package Ecommerce;

public class Product 
{
    String name;
    double price;
    int quantity;


    public Product(String name, double price, int quantity) 
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public void displayProductInfo() 
    {
        System.out.println("Product: " + name + ", Price: $" + price + ", Available: " + quantity + " units");
    }


    public boolean isAvailable(int orderQuantity) 
    {
        return orderQuantity <= quantity;
    }

    public void updateQuantity(int orderQuantity) 
    {
        if (orderQuantity <= quantity) 
        {
            quantity -= orderQuantity;
        }
    }
}
