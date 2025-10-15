package LatihanQuiz.factory;

import LatihanQuiz.model.Cake;
import LatihanQuiz.model.Tart;
import java.util.ArrayList;

public class TartFactory extends CakeAbstractFactory {
    private String softness;
    private ArrayList<String> toppings;
    private double price;
    private String paymentType;

    public TartFactory(String softness, ArrayList<String> toppings, double price, String paymentType) {
        this.softness = softness;
        this.toppings = toppings;
        this.price = price;
        this.paymentType = paymentType;
    }

    @Override
    public Cake createCake() {
        return new Tart(softness, toppings, price, paymentType);
    }
}
