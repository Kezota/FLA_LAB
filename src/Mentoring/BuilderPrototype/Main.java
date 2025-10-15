package Mentoring.BuilderPrototype;

import Mentoring.BuilderPrototype.builder.MenuItemBuilder;
import Mentoring.BuilderPrototype.model.Pasta;
import Mentoring.BuilderPrototype.model.Pizza;
import Mentoring.BuilderPrototype.model.MenuItem;
import Mentoring.BuilderPrototype.singleton.Database;
import Mentoring.BuilderPrototype.factory.Factory;

public class Main {
    public Main() {
        // before builde
        Factory factory = new Factory();

        MenuItem pizza2 = factory.createMenuItem("pizza", "cheese", 60000, "spinach");
        MenuItem pasta2 = factory.createMenuItem("pasta", "original", 60000, "seaweed");

//        MenuItemBuilder builder = new MenuItemBuilder();
//
//        Pizza pizza2 = builder
//                .setFlavour("cheese")
//                .setPrice(60000)
//                .setVeggie("spinach")
//                .buildPizza();
//
//        Pasta pasta2 = builder
//                .setFlavour("original")
//                .setPrice(60000)
//                .setVeggie("seaweed")
//                .buildPasta();

        // add to db
        Database db = Database.getInstance();
        db.addMenuItem(pizza2);
        db.addMenuItem(pasta2);

        for(MenuItem item : db.getMenuItems()) {
            item.isCooking();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
