package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "Bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime make_date;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client id_client;

    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee id_employee;

    public Bill() {}
    public Bill(Long id, LocalDateTime make_date, Client id_client, Employee id_employee) {
        super();
        this.id = id;
        this.make_date = make_date;
        this.id_client = id_client;
        this.id_employee = id_employee;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getMake_date() {
        return make_date;
    }

    public Client getClient() {
        return id_client;
    }

    public Employee getEmployee() {
        return id_employee;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMake_date(LocalDateTime make_date) {
        this.make_date = make_date;
    }

    public void setClient(Client id_client) {
        this.id_client = id_client;
    }

    public void setEmployee(Employee id_employee) {
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
