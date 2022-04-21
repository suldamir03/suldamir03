package Rest;

import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private double price;

    Product(int i, String n, double p) {
        id = i;
        name = n;
        price = p;
    }
    Product() {

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void getDescription() {

        System.out.println("Product ID = " + getId()+ "\nProduct name = " + getName() + "\nProduct price = " + getPrice() + "\n");
    }
}
