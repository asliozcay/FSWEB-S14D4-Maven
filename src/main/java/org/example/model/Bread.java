package org.example.model;

public class Bread extends ProductForSale{
    private double weightInGrams;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, double weightInGrams) {
        super(type, price, description);
        this.weightInGrams = weightInGrams;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Weight: " + weightInGrams + " grams");
        System.out.println("Price: " + getPrice() + " $");
        System.out.println("Description: " + getDescription());
    }
}
