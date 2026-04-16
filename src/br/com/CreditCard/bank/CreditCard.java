package br.com.CreditCard.bank;

public class CreditCard {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int payWithCredit(float price){
        if (this.balance >= price) {
            this.balance -= price;
            return 1;
        } else {
            System.out.println("SALDO INSUFICIENTE!");
            return 0;
        }
    }
}
