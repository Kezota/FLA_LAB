package Mentoring.Singleton.factory;

import Mentoring.Singleton.model.MenuItem;
import Mentoring.Singleton.model.Pasta;
import Mentoring.Singleton.model.Pizza;

public class Factory {
	public MenuItem createMenuItem(String type, String flavour, Integer price, String veggie) {
		switch (type.toLowerCase()) {
		case "pizza":
			return new Pizza(flavour, price, veggie);
		case "pasta":
			return new Pasta(flavour, price, veggie);
		default:
			return null;
		}
	}
	
}
