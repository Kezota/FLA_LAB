package LatihanQuiz.model;

import java.util.ArrayList;

public class Tart extends Cake {
    public Tart(String softness, ArrayList<String> toppings, double price, String paymentType) {
        super(softness, toppings, price, paymentType);
    }

    @Override
    public void serve() {
        System.out.println("Tart is served");
    }
}
