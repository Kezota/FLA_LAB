package Mentoring.FactoryMethod;

import Mentoring.FactoryMethod.factory.Factory;
import Mentoring.FactoryMethod.model.MenuItem;
import Mentoring.FactoryMethod.model.Pasta;
import Mentoring.FactoryMethod.model.Pizza;

public class Main {
    public Main() {
        // before factory
        Pizza pizza1 = new Pizza("cheese", 50000, "spinach");
        Pasta pasta1 = new Pasta("original", 50000, "seaweed");

        pizza1.isCooking();
        pasta1.isCooking();

        // after factory
        Factory factory = new Factory();

        MenuItem pizza2 = factory.createMenuItem("pizza", "cheese", 60000, "spinach");
        MenuItem pasta2 = factory.createMenuItem("pasta", "original", 60000, "seaweed");

        pizza2.isCooking();
        pasta2.isCooking();
    }

    public static void main(String[] args) {
        new Main();
    }
}
