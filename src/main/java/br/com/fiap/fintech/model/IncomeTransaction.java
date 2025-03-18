package br.com.fiap.fintech.model;
import java.time.LocalDateTime;
import java.util.UUID;

public class IncomeTransaction extends Transaction {

    public IncomeTransaction(String description, double value, LocalDateTime date, String category, String incomeSource) {
        super(description, value, date, category, incomeSource);
    }

    @Override
    public void getTransactionDetails(UUID id) {
        System.out.println("Detalhes da Transação de Receita:");
        super.getTransactionDetails(id);
    }
}
