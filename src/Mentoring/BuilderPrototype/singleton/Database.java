package Mentoring.BuilderPrototype.singleton;

import Mentoring.BuilderPrototype.model.MenuItem;

import java.util.ArrayList;

public class Database {
    private static final Database db = new Database();
    private ArrayList<MenuItem> menuItems;

	public Database() {
        menuItems = new ArrayList<>();
		System.out.println("Database is Connected");
	}

	public static Database getInstance() {
		return db;
	}

    public void addMenuItem(MenuItem item) {
        db.menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
