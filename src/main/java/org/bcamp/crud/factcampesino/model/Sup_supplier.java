package org.bcamp.crud.factcampesino.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Sup_supplier")
public class Sup_supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Double buy_price_unit;
    private Date buy_date;
    private int amount;

    @ManyToOne
    @JoinColumn(name = "id_supply")
    private Supply id_supply;

    @ManyToOne
    @JoinColumn(name = "id_supplier")
    private Supplier id_supplier;

    public Sup_supplier() {

    }

    public Sup_supplier(int id, Double buy_price, Date buy_date, int amount, Supply id_supply, Supplier id_supplier) {
        super();
        this.id = id;
        this.buy_price_unit = buy_price;
        this.buy_date = buy_date;
        this.amount = amount;
        this.id_supply = id_supply;
        this.id_supplier = id_supplier;
    }

    //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getBuy_price() {
        return buy_price_unit;
    }

    public void setBuy_price(Double buy_price) {
        this.buy_price_unit = buy_price;
    }

    public Date getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(Date buy_date) {
        this.buy_date = buy_date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Supply getProduct() {
        return id_supply;
    }

    public void setProduct(Supply id_supply) {
        this.id_supply = id_supply;
    }

    public Supplier getSupplier() {
        return id_supplier;
    }

    public void setSupplier(Supplier id_supplier) {
        this.id_supplier = id_supplier;
    }
}
