package br.com.fiap.fintech.model;

import javax.persistence.Entity;

@Entity
public class TreasuryDirect extends Investment {
    public TreasuryDirect(String name, double value, double rate, int term, String risk, String status, User owner) {
        super(name, value, rate, term, "Tesouro Direto", risk, status, owner);
    }

    public TreasuryDirect() {

    }
}