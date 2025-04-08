package br.com.fiap.fintech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public abstract class Operation {
    private LocalDateTime date;
    private double amount;
    private String description;
    @Id
    @GeneratedValue
    private Long id;

    public Operation(LocalDateTime date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public Operation() {

    }

    public abstract void execute(Account account);

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}