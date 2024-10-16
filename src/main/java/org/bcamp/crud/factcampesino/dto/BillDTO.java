package org.bcamp.crud.factcampesino.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class BillDTO {

    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime make_date;
    private Long id_client;
    private Long id_employee;

    public BillDTO() {}
    public BillDTO(Long id, LocalDateTime make_date, Long id_client, Long id_employee) {
        super();
        this.id = id;
        this.make_date = make_date;
        this.id_client = id_client;
        this.id_employee = id_employee;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getMake_date() {
        return make_date;
    }
    public void setMake_date(LocalDateTime make_date) {
        this.make_date = make_date;
    }
    public Long getId_client() {
        return id_client;
    }
    public void setId_client(Long id_client) {
        this.id_client = id_client;
    }
    public Long getId_employee() {
        return id_employee;
    }
    public void setId_employee(Long id_employee) {
        this.id_employee = id_employee;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", makeDate='" + make_date + '\'' +
                ", id_client=" + id_client +
                ", id_employee=" + id_employee +
                '}';
    }
}
