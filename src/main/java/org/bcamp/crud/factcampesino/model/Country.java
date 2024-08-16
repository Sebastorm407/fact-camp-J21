package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public Country(){}
    public Country(int id, String name){
        super();
        this.id = id;
        this.name = name;
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
