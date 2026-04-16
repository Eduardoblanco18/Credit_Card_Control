package br.com.CreditCard.bank;

import br.com.CreditCard.shop.Items;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double balance;
    private double limit;
    private List<Items> items;

    public List<Items> getItems() {
        return items;
    }

    public double getBalance() {
        return balance;
    }

    public double getLimit() {
        return limit;
    }

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.items = new ArrayList<>();
    }

    public boolean payWithCredit(Items item) {
        if (this.balance >= item.getPrice()){
            this.balance -= item.getPrice();
            this.items.add(item);
            return true;
        }

        return false;
    }
}
