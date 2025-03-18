package br.com.fiap.fintech.model;

public class Investment {
    private String name;
    private double value;
    private double rate;
    private int term;
    private String type;
    private String risk;
    private String status;
    private User owner;

    public Investment() {
    }

    public Investment(String name, double value, double rate, int term, String type, String risk, String status, User owner) {
        this.name = name;
        this.value = value;
        this.rate = rate;
        this.term = term;
        this.type = type;
        this.risk = risk;
        this.status = status;
        this.owner = owner;
    }

    public void getInvestmentDetails() {
        System.out.println("Investimento: " + this.name);
        System.out.println("Valor: " + this.value);
        System.out.println("Taxa: " + this.rate);
        System.out.println("Prazo: " + this.term);
        System.out.println("Tipo: " + this.type);
        System.out.println("Risco: " + this.risk);
        System.out.println("Status: " + this.status);
        System.out.println("Proprietário: " + this.owner.getName());
    }
}