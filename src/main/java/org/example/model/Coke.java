package org.example.model;

public class Coke extends ProductForSale{
    private boolean hasSugar;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, boolean hasSugar) {
        super(type, price, description);
        this.hasSugar = hasSugar;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Has Sugar: " + (hasSugar ? "Yes" : "No"));
        System.out.println("Price: " + getPrice() + " $");
        System.out.println("Description: " + getDescription());
    }
}
