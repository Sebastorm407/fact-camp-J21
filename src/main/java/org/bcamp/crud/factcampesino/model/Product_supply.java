package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Product_supply")
public class Product_supply {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date make_date;
    private int amount;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product id_product;

    @ManyToOne
    @JoinColumn(name = "id_supply")
    private Supply id_supply;

    public Product_supply() {
    }

    public Product_supply(int id, Date make_date, int amount, Product product, Supply supply) {
        super();
        this.id = id;
        this.make_date = make_date;
        this.amount = amount;
        this.id_product = product;
        this.id_supply = supply;
    }

    // GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMake_date() {
        return make_date;
    }

    public void setMake_date(Date make_date) {
        this.make_date = make_date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return id_product;
    }

    public void setProduct(Product product) {
        this.id_product = product;
    }

    public Supply getId_sup_supplier() {
        return id_supply;
    }

    public void setId_sup_supplier(Supply id_supply) {
        this.id_supply = id_supply;
    }
}
