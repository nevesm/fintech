package br.com.fiap.fintech.model;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Transfer extends Operation {
    private Account recipientAccount;

    public Transfer(LocalDateTime date, double amount, String description, Account recipientAccount) {
        super(date, amount, description);
        this.recipientAccount = recipientAccount;
    }

    @Override
    public void execute(Account account) {
        if (account.getBalance() < getAmount()) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar a transferência!");
        }
        account.setBalance(account.getBalance() - getAmount());
        recipientAccount.setBalance(recipientAccount.getBalance() + getAmount());
        System.out.println("Transferência realizada: R$" + getAmount());
    }

    public Account getRecipientAccount() {
        return recipientAccount;
    }

    public void setRecipientAccount(Account recipientAccount) {
        this.recipientAccount = recipientAccount;
    }
}