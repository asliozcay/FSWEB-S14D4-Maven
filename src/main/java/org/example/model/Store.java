package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Chocolate", 3, "Delicious chocolate", "ETİ");
        products[1] = new Coke("Coke", 2, "Refreshing cola drink", true);
        products[2] = new Bread("Bread", 1, "Freshly baked bread", 250.0);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}