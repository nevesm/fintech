package br.com.fiap.fintech.model;

import javax.persistence.Entity;

@Entity
public class CDB extends Investment {
    public CDB(String name, double value, double rate, int term, String risk, String status, User owner) {
        super(name, value, rate, term, "CDB", risk, status, owner);
    }

    public CDB() {

    }
}