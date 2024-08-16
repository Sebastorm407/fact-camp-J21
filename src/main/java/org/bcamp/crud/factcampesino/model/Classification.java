package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Classification")
public class Classification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category id_category;

    public Classification() {}
    public Classification(int id, String name, Category id_category) {
        super();
        this.id = id;
        this.name = name;
        this.id_category = id_category;
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getId_category() {
        return id_category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId_category(Category id_category) {
        this.id_category = id_category;
    }
}
