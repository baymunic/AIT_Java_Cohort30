package practice.bank.controller;

import practice.bank.model.BankAccount;

public class BankApp {
    public static void main(String[] args) {

        // создаём объектные переменные

        BankAccount account1 = new BankAccount(1000L, "Dmitriy", "Volksbank", 101, 100);
        // account1 - объектная переменная, в которой собраны все поля класса и значения

        System.out.println(account1.getBalance());
        System.out.println(account1.getOwner());
        System.out.println("===================");
        account1.display();

        // внести деньги на счёт

        account1.deposit(500); // у account1 вырос баланс
        account1.display();
        account1.withdraw(100);
        account1.display();
        account1.withdraw(1000);
        account1.display();
        account1.withdraw(200);
        account1.display();

        BankAccount account2 = new BankAccount(1002L, "Oleg", "Postbank", 56);
        BankAccount account3 = new BankAccount(1003L, "Maria", "Targobank",  45);
        BankAccount account4 = new BankAccount(1004L, "Deutschebank", 4, 1500);
    }
}
