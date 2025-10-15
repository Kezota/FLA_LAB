package LatihanQuiz.model;

import java.util.ArrayList;

public abstract class Cake {
    private String softness;
    private ArrayList<String> toppings;
    private double price;
    private String paymentType;

    public Cake(String softness, ArrayList<String> toppings, double price, String paymentType) {
        this.softness = softness;
        this.toppings = toppings;
        this.price = price;
        this.paymentType = paymentType;
    }

    public abstract void serve();

    public String getSoftness() {
        return softness;
    }

    public void setSoftness(String softness) {
        this.softness = softness;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
