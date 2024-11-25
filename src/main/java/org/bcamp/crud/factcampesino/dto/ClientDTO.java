package org.bcamp.crud.factcampesino.dto;

public class ClientDTO {
    private Long number_id;
    private String name;
    private String last_name;
    private String birthdate;
    private String address;
    private String phone_number;
    private Long id_city;  // Recibe solo el ID de la ciudad
    private Long id_gender; // Recibe solo el ID del género

    // Getters y Setters

    public Long getNumber_id() {
        return number_id;
    }

    public void setNumber_id(Long number_id) {
        this.number_id = number_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Long getId_city() {
        return id_city;
    }

    public void setId_city(Long id_city) {
        this.id_city = id_city;
    }

    public Long getId_gender() {
        return id_gender;
    }

    public void setId_gender(Long id_gender) {
        this.id_gender = id_gender;
    }
}
