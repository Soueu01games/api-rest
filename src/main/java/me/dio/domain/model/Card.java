package me.dio.domain.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique =  true)
    private String number;

    @Column(name = "available_limit", scale = 2 ,precision = 13)
    private double limit;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }


    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public double getLimit() { return limit; }
    public void setLimit(double limit) { this.limit = limit; }
}

