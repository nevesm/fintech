package br.com.fiap.fintech.model;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Withdrawal extends Operation {

    public Withdrawal(LocalDateTime date, double amount, String description) {
        super(date, amount, description);
    }

    public Withdrawal() {
        super();
    }

    @Override
    public void execute(Account account) {
        if (account.getBalance() < getAmount()) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque!");
        }
        account.setBalance(account.getBalance() - getAmount());
        System.out.println("Saque realizado: R$" + getAmount());
    }
}