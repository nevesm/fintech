package br.com.fiap.fintech.model;

import java.util.UUID;

public class Bank {
    private final UUID id = UUID.randomUUID();
    private String name;
    private String code;
    private String branch;
    private String account;
    private String accountDigit;

    public Bank() {}

    public Bank(String name, String code, String branch, String account, String accountDigit) {
        this.name = name;
        this.code = code;
        this.branch = branch;
        this.account = account;
        this.accountDigit = accountDigit;
    }

    public void getBankAccountDetails() {
        System.out.println("Banco: " + name);
        System.out.println("Código: " + code);
        System.out.println("Agência: " + branch);
        System.out.println("Conta: " + account + "-" + accountDigit);
    }

    // Getters e Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    // Adicionar outros getters e setters conforme necessário
}