package br.com.CreditCard.shop;

public class Items {
    private String name;
    private float price;

    public Items(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Compra: nome = " + this.name + ", valor= " + this.price;
    }
}
