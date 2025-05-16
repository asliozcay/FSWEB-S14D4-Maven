package org.example.model;

public class Chocolate extends ProductForSale{
    private String brand;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + getPrice() + " $");
        System.out.println("Description: " + getDescription());
    }
}
