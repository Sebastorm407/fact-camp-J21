package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Department")
public class  Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_country")
    private Country country;

    public Department(){}

    public Department(int id, String name, Country country){
        super();
        this.id = id;
        this.name = name;
        this.country = country;
    }

    //SETTERS AND GETTERS
    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public Country getCountry(){
        return country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCountry(Country country){
        this.country = country;
    }
}
