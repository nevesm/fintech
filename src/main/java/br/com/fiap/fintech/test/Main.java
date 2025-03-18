package br.com.fiap.fintech.test;

import br.com.fiap.fintech.model.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // Criando um usuário
        User user = new User("Marcus Neves", "marcus.neves@fiap.com.br");

        // Criando um banco
        Bank bank = new Bank("Banco Itau", "001", "1234", "56789", "0");
        bank.getBankAccountDetails();

        // Criando um cartão
        Card card = new Card("Mastercard Uniclass Black", "1234", "mastercard", "Crédito", user);
        card.getCardDetails();

        // Invocando métodos
        user.login();

        // Criando uma transação de receita
        IncomeTransaction incomeTransaction = new IncomeTransaction(
                "Salário",
                5000.00,
                LocalDateTime.now(),
                "Receitas",
                "Empresa XYZ"
        );

        System.out.println("### Receita ###");
        incomeTransaction.getTransactionDetails(UUID.randomUUID());

        // Criando uma transação de despesa com conta bancária
        ExpenseTransaction expenseTransaction = new ExpenseTransaction(
                "Pagamento de Aluguel",
                1500.00,
                LocalDateTime.now(),
                "Despesas",
                bank,
                "Imobiliária ABC"
        );

        System.out.println("\n### Despesa ###");
        expenseTransaction.getTransactionDetails(UUID.randomUUID());
    }
}
