package br.com.fiap.fintech.model;
import java.time.LocalDateTime;

public class Deposit extends Operation {

    public Deposit(LocalDateTime date, double amount, String description) {
        super(date, amount, description);
    }

    @Override
    public void execute(Account account) {
        account.setBalance(account.getBalance() + getAmount());
        System.out.println("Depósito realizado: R$" + getAmount());
    }
}