package br.com.fiap.fintech.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class ExpenseTransaction extends Transaction {

    public ExpenseTransaction(String description, double value, LocalDateTime date, String category, Bank payerBankAccountId, String payee) {
        super(description, value, date, category, payerBankAccountId, payee);
    }

    @Override
    public void getTransactionDetails(UUID id) {
        System.out.println("Detalhes da Transação de Despesa:");
        super.getTransactionDetails(id);
    }
}