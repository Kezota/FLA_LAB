package Mentoring.FactoryMethod.factory;

import Mentoring.FactoryMethod.model.MenuItem;
import Mentoring.FactoryMethod.model.Pasta;
import Mentoring.FactoryMethod.model.Pizza;

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
