package me.dio.domain.model;

public class Card {
    private Long id;
    private String number;
    private double limit;

    // Getter e Setter para id
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    // Getter e Setter para number
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    // Getter e Setter para limit
    public double getLimit() { return limit; }
    public void setLimit(double limit) { this.limit = limit; }
}

