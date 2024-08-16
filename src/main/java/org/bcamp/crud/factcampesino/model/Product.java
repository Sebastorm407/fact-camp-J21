package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Double sell_price;

    public Product() {

    }
    public Product(int id, String name, Double sell_price) {
        super();
        this.id = id;
        this.name = name;
        this.sell_price = sell_price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSell_price() {
        return sell_price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSell_price(Double sell_price) {
        this.sell_price = sell_price;
    }
}
