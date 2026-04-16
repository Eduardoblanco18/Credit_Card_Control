package br.com.CreditCard.main;

import br.com.CreditCard.bank.CreditCard;
import br.com.CreditCard.shop.Items;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limit = scanner.nextDouble();
        CreditCard myCreditCard = new CreditCard(limit);

        int exit = 1;
        while (exit != 0){
            System.out.println("Digite o nome do item de compra:");
            String name = scanner.next();

            System.out.println("Digite o valor da compra:");
            double price = scanner.nextDouble();

            Items item = new Items(name, price);
            boolean approved = myCreditCard.payWithCredit(item);

            if (approved) {
                System.out.println("Compra realziada!");
                System.out.println("Digite 0 para sair ou 1 para continuar!");
                exit = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                exit = 0;
            }
        }
        System.out.println("**************************************************");
        System.out.println("COMPRAS REALIZADAS:\n");

        myCreditCard.getItems().sort(Comparator.comparing(Items::getPrice));
        for (Items i: myCreditCard.getItems()) {
            System.out.println(i.getName() + " - " + i.getPrice());
        }
        System.out.println("\n*******************************************************");

        System.out.println("\nSaldo restante do cartão: " + myCreditCard.getBalance());
    }
}
