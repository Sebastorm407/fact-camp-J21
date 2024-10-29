package org.bcamp.crud.factcampesino.dto;

import org.bcamp.crud.factcampesino.model.Bill;

public class DetailBillDTO {
    private Long id;
    private int amount;
    private double unit_price;
    private Long id_product;
    private Long id_bill;

    public DetailBillDTO() {}
    public DetailBillDTO(Long id, int amount, double unit_price, Long id_product, Long id_bill) {
        this.id = id;
        this.amount = amount;
        this.unit_price = unit_price;
        this.id_product = id_product;
        this.id_bill = id_bill;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
    public Long getId_product() {
        return id_product;
    }
    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }
    public Long getId_bill() {
        return id_bill;
    }
    public void setId_bill(Long id_bill) {
        this.id_bill = id_bill;
    }

    @Override
    public String toString() {
        return "DetailBillDTO [id=" + id + ", amount=" + amount + ", unit_price="
                + unit_price + ", id_product=" + id_product + ", id_bill="
                + id_bill + "]";
    }
}
