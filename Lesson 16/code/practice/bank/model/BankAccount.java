package practice.bank.model;

public class BankAccount {
    // поля класса
    private long account; // номер счёта
    private String owner; // владелец счёта
    private String bank; // банк
    private int branch; // филиал
    private double balance; // баланс

    // методы класса
    // конструктор класса
    public BankAccount(long account, String owner, String bank, int branch, double balance) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
    }

    // конструктор без баланса
    public BankAccount(long account, String owner, String bank, int branch) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
    }

    // конструктор без баланса
    public BankAccount(long account, String bank, int branch, double balance) {
        this.account = account;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
    }



    public void deposit (double sum){
        balance = balance + sum; // добавили деньги на счёт
    }
    public boolean withdraw (double sum) {
        if (sum <= balance){
            balance = balance - sum; // снимаем деньги с счёта
            return true;
        }
        return false;
    }
    // геттеры и сеттеры


    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display (){
        System.out.println("Account: " + account);
        System.out.println("Owner: " + owner);
        System.out.println("Bank: " + bank);
        System.out.println("Branch: " + branch);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}
