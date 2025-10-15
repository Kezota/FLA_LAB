package Mentoring.Singleton;


import Mentoring.Singleton.factory.Factory;
import Mentoring.Singleton.model.MenuItem;
import Mentoring.Singleton.singleton.Database;

public class Main {
    public Main() {
        // after factory
        Factory factory = new Factory();

        MenuItem pizza2 = factory.createMenuItem("pizza", "cheese", 60000, "spinach");
        MenuItem pasta2 = factory.createMenuItem("pasta", "original", 60000, "seaweed");

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
