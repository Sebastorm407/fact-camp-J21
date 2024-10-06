package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date make_date;
    private int amount;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client id_client;

    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee id_employee;

    public Bill() {}
    public Bill(int id, Date make_date, int amount, Client client, Employee employee) {
        super();
        this.id = id;
        this.make_date = make_date;
        this.amount = amount;
        this.id_client = client;
        this.id_employee = employee;
    }

    public int getId() {
        return id;
    }

    public Date getMake_date() {
        return make_date;
    }

    public int getAmount() {
        return amount;
    }

    public Client getClient() {
        return id_client;
    }

    public Employee getEmployee() {
        return id_employee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMake_date(Date make_date) {
        this.make_date = make_date;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setClient(Client id_client) {
        this.id_client = id_client;
    }

    public void setEmployee(Employee id_employee) {
        this.id_employee = id_employee;
    }
}
