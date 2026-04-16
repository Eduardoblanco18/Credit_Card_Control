package br.com.CreditCard.shop;

public class Items {
    private String name;
    private double price;

    public Items(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.price + "\n";
    }
}
