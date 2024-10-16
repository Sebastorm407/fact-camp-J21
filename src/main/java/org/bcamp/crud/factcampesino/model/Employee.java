package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numberId;
    private String password_id;
    private String name;
    private String last_name;
    private String birthdate;
    private String address;
    private String phone_number;

    @ManyToOne
    @JoinColumn(name = "id_gender")
    private Gender id_gender;

    @ManyToOne
    @JoinColumn(name = "id_city")
    private City id_city;

    public Employee(){

    }

    public Employee(Long id, Long numberId, String password_id,String name, String last_name, String birthdate, String address, String phone_number, Gender id_gender, City id_city) {
        super();
        this.id = id;
        this.numberId = numberId;
        this.password_id = password_id;
        this.name = name;
        this.last_name = last_name;
        this.birthdate = birthdate;
        this.address = address;
        this.phone_number = phone_number;
        this.id_gender = id_gender;
        this.id_city = id_city;
    }

    //GETTERS AND SETTERS

    public Long getId() {
        return id;
    }

    public Long getNumberId() {
        return numberId;
    }

    public String getPassword_id() {
        return password_id;
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

    public String getPhone_number() {
        return phone_number;
    }

    public Gender getGender() {
        return id_gender;
    }

    public City getCity() {
        return id_city;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumberId(Long numberId) {
        this.numberId = numberId;
    }

    public void setPassword_id(String password_id) {
        this.password_id = password_id;
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

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setGender(Gender id_gender) {
        this.id_gender = id_gender;
    }

    public void setCity(City city) {
        this.id_city = city;
    }

}
