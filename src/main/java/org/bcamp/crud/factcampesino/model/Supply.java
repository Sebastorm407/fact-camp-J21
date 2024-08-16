package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Supply")
public class Supply {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Double sell_price;

    @ManyToOne
    @JoinColumn(name = "id_classification")
    private Classification classification;

    public Supply(){}
    public Supply(int id, String name, Double sell_price, Classification classification) {
        super();
        this.id = id;
        this.name = name;
        this.sell_price = sell_price;
        this.classification = classification;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public Double getSellPrice(){
        return sell_price;
    }

    public Classification getClassification(){
        return classification;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSellPrice(Double sell_price) {
        this.sell_price = sell_price;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }
}
