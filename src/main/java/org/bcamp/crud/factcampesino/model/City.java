package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

@Entity
@Table(name = "City")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_department")
    private Department id_department;

    public City() {}

    public City(int id, String name, Department id_department) {
        super();
        this.id = id;
        this.name = name;
        this.id_department = id_department;
    }

    //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public Department getDepartment() {
        return id_department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department id_department) {
        this.id_department = id_department;
    }
}

