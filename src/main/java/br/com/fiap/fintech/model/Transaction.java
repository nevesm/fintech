package br.com.fiap.fintech.model;
import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private final UUID id = UUID.randomUUID();
    private String description;
    private double value;
    private LocalDateTime date;
    private String category;
    private Bank payerBankAccountId;
    private Card payerCardId;
    private String payee;
    private Investment investmentId;
    private String incomeSource;

    public Transaction() {
    }

    public Transaction(String description, double value, LocalDateTime date, String category, Card payerCardId, String payee) {
        this.description = description;
        this.value = value;
        this.date = date;
        this.category = category;
        this.payerCardId = payerCardId;
        this.payee = payee;
    }

    public Transaction(String description, double value, LocalDateTime date, String category, Bank payerBankAccountId, String payee) {
        this.description = description;
        this.value = value;
        this.date = date;
        this.category = category;
        this.payerBankAccountId = payerBankAccountId;
        this.payee = payee;
    }

    public Transaction(String description, double value, LocalDateTime date, String category, Investment investmentId, String payee) {
        this.description = description;
        this.value = value;
        this.date = date;
        this.category = category;
        this.investmentId = investmentId;
    }

    public Transaction(String description, double value, LocalDateTime date, String category, String incomeSource) {
        this.description = description;
        this.value = value;
        this.date = date;
        this.category = category;
        this.incomeSource = incomeSource;
    }

    public void getTransactionDetails(UUID id) {
        System.out.println("Transação: " + id);
        System.out.println("Descrição: " + this.description);
        System.out.println("Valor: " + this.value);
        System.out.println("Data: " + this.date);
        System.out.println("Categoria: " + this.category);
        if (this.payerBankAccountId != null) {
            System.out.println("Pagador: " + this.payerBankAccountId);
        } else if (this.payerCardId != null) {
            System.out.println("Pagador: " + this.payerCardId);
        } else if (this.investmentId != null) {
            System.out.println("Pagador: " + this.investmentId);
        } else {
            System.out.println("Pagador: " + this.incomeSource);
        }
    }
}