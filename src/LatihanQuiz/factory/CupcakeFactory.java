package LatihanQuiz.factory;

import LatihanQuiz.model.Cake;
import LatihanQuiz.model.Cupcake;
import java.util.ArrayList;

public class CupcakeFactory extends CakeAbstractFactory {
    private String softness;
    private ArrayList<String> toppings;
    private double price;
    private String paymentType;

    public CupcakeFactory(String softness, ArrayList<String> toppings, double price, String paymentType) {
        this.softness = softness;
        this.toppings = toppings;
        this.price = price;
        this.paymentType = paymentType;
    }

    @Override
    public Cake createCake() {
        return new Cupcake(softness, toppings, price, paymentType);
    }
}
