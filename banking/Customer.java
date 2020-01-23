package banking;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String CIF;
    private double balance;
    private ArrayList<Double> transactions;

    public Customer(String name, String CIF, double initialBalance) {
        this.name = name;
        this.CIF = CIF;
        this.balance = initialBalance;
        this.transactions = new ArrayList<Double>();
        newTransaction(initialBalance);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void newTransaction(double amount){
        this.transactions.add(amount);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
