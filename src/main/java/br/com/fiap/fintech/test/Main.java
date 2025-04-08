package br.com.fiap.fintech.test;
import br.com.fiap.fintech.model.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User("Marcus Neves", "marcus.neves@fiap.com.br");
        User secondUser = new User("Flavio Neves", "flavio.neves@fiap.com.br");

        Card firstCard = new Card("Mastercard Uniclass Black", "1234", "Mastercard", "Crédito", firstUser);
        Card secondCard = new Card("Visa Platinum", "5678", "Visa", "Crédito", secondUser);
        firstCard.getCardDetails();
        secondCard.getCardDetails();

        firstUser.login();
        secondUser.login();

        Account firstAccount = new Account("Banco do Brasil", 001, "4541", 1050906, 2, 1000.00, firstUser);
        Account secondAccount = new Account("Itaú", 002, "1234", 5678901, 3, 1000.00, secondUser);

        Deposit firstAccountDeposit = new Deposit(LocalDateTime.now(), 1000.00, "Depósito em conta");
        firstAccountDeposit.execute(firstAccount);

        Withdrawal firstAccountWithdrawal = new Withdrawal(LocalDateTime.now(), 500.00, "Saque em caixa eletrônico");
        firstAccountWithdrawal.execute(firstAccount);

        Transfer firstAccountTransferToSecondAccount = new Transfer(LocalDateTime.now(), 1000.00, "Transferência entre contas", secondAccount);
        firstAccountTransferToSecondAccount.execute(firstAccount);

        System.out.println("Saldo da conta de " + firstUser.getName() + ": R$" + firstAccount.getBalance());
        System.out.println("Saldo da conta de " + secondUser.getName() + ": R$" + secondAccount.getBalance());
    }
}
