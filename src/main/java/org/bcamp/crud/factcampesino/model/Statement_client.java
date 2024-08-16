package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Statement_client")
public class Statement_client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date make_date;
    private int amount;

    @ManyToOne
    @JoinColumn(name = "id_product_supply")
    private Product_supply product_supply;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee employee;

    public Statement_client() {}
    public Statement_client(int id, Date make_date, int amount, Product_supply product_supply, Client client, Employee employee) {
        super();
        this.id = id;
        this.make_date = make_date;
        this.amount = amount;
        this.product_supply = product_supply;
        this.client = client;
        this.employee = employee;
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

    public Product_supply getProduct_supply() {
        return product_supply;
    }

    public Client getClient() {
        return client;
    }

    public Employee getEmployee() {
        return employee;
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

    public void setProduct_supply(Product_supply product_supply) {
        this.product_supply = product_supply;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
