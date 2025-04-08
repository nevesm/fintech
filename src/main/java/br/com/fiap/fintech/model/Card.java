package br.com.fiap.fintech.model;

import javax.persistence.Entity;

@Entity
public class Card {
    private String cardFriendlyName;
    private String cardLastFourDigits;
    private String cardBrand;
    private String cardType;
    private User owner;

    public Card() {}

    public Card(String cardFriendlyName, String cardLastFourDigits, String cardBrand, String cardType, User owner) {
        this.cardFriendlyName = cardFriendlyName;
        this.cardLastFourDigits = cardLastFourDigits;
        this.cardBrand = cardBrand;
        this.cardType = cardType;
        this.owner = owner;
    }

    public void getCardDetails() {
        System.out.println("Nome do cartão: " + cardFriendlyName);
        System.out.println("Últimos 4 dígitos: " + cardLastFourDigits);
        System.out.println("Bandeira: " + cardBrand);
        System.out.println("Tipo: " + cardType);
        System.out.println("Proprietário: " + owner.getName());
    }

    // Getters e Setters
    public String getCardFriendlyName() { return cardFriendlyName; }
    public void setCardFriendlyName(String cardFriendlyName) { this.cardFriendlyName = cardFriendlyName; }
}