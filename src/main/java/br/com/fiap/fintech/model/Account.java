package br.com.fiap.fintech.model;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Account {
    private final UUID id = UUID.randomUUID();
    private String name;
    private int code;
    private String branch;
    private int number;
    private int digit;
    private User holder;
    private double balance;

    public Account(String name, int code, String branch, int number, int digit, double balance, User holder) {
        this.name = name;
        this.code = code;
        this.branch = branch;
        this.number = number;
        this.digit = digit;
        this.balance = balance;
        this.holder = holder;
    }

    public int getAccountNumber() {
        return number;
    }

    public void setAccountNumber(int number) {
        this.number = number;
    }

    public String getAccountHolder() {
        return holder.getName();
    }

    public void setAccountHolder(User holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}