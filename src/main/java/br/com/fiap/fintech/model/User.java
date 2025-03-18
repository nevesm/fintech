package br.com.fiap.fintech.model;

import java.util.UUID;

public class User {
    private final UUID id = UUID.randomUUID();
    private String name;
    private String email;

    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Métodos de exemplo
    public void login() {
        System.out.println(name + " está logando com o e-mail: " + email);
    }
}