package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int number_id;
    private String name;
    private String last_name;
    private String birthdate;
    private String address;
    private int phone_number;

    @ManyToOne
    @JoinColumn(name = "id_gender")
    private Gender id_gender;

    @ManyToOne
    @JoinColumn(name = "id_city")
    private City id_city;

    public Supplier(){

    }

    public Supplier(int id, int number_id, String name, String last_name, String birthdate, String address, int phone_number, Gender id_gender, City id_city) {
        super();
        this.id = id;
        this.number_id = number_id;
        this.name = name;
        this.last_name = last_name;
        this.birthdate = birthdate;
        this.address = address;
        this.phone_number = phone_number;
        this.id_gender = id_gender;
        this.id_city = id_city;
    }

    //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public int getNumber_id() {
        return number_id;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public Gender getGender() {
        return id_gender;
    }

    public City getCity() {
        return id_city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber_id(int number_id) {
        this.number_id = number_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setGender(Gender id_gender) {
        this.id_gender = id_gender;
    }

    public void setCity(City city) {
        this.id_city = city;
    }

}
