package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

@Entity
@Table(name = "DetailBill")
public class DetailBill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int amount;
    private double unit_price;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product id_product;

    @ManyToOne
    @JoinColumn(name = "id_bill")
    private Bill id_bill;

    public DetailBill() {}
    public DetailBill(int id, int amount, Product id_product, Bill id_bill) {
        super();
        this.id = id;
        this.amount = amount;
        this.id_product = id_product;
        this.id_bill = id_bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public Product getId_product() {
        return id_product;
    }

    public void setId_product(Product id_product) {
        this.id_product = id_product;
    }

    public Bill getId_bill() {
        return id_bill;
    }

    public void setId_bill(Bill id_bill) {
        this.id_bill = id_bill;
    }
}

