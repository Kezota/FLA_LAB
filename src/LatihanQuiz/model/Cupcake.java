package LatihanQuiz.model;

import java.util.ArrayList;

public class Cupcake extends Cake {
    public Cupcake(String softness, ArrayList<String> toppings, double price, String paymentType) {
        super(softness, toppings, price, paymentType);
    }

    @Override
    public void serve() {
        System.out.println("Cupcake is served");
    }
}
