package org.bcamp.crud.factcampesino.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Supply")
public class Supply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double buy_price;

    @ManyToOne
    @JoinColumn(name = "id_category", nullable = false)
    private Category category;


    public Supply(){}
    public Supply(Long id, String name, Double buy_price, Category category) {
        super();
        this.id = id;
        this.name = name;
        this.buy_price = buy_price;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    @JsonProperty("buy_price")
    public Double getBuyPrice(){
        return buy_price;
    }

    public Category getCategory(){
        return category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBuyPrice(Double buy_price) {
        this.buy_price = buy_price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
