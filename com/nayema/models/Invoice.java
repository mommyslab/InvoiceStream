// In this package, we have "models"
// they are java objects which we can create, such as this invoice
package com.nayema.models;

/**
 * Created by Sadia Auroni on 1/25/2017.
 */
public class Invoice {
    private int number;
    private String description;
    private int numpurchase;
    private double price;
    private double value;
// pleas
    // Invoice constructor
    public Invoice(int n, String d, int np, double p) {
        this.number = n;
        this.description = d;
        this.numpurchase = np;
        this.price = p;
        this.value=this.price*this.numpurchase;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumpurchase () {
        return numpurchase;
    }

    public void setNumpurchase(int numpurchase) {
        this.numpurchase = numpurchase;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
