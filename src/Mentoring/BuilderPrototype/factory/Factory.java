package Mentoring.BuilderPrototype.factory;

import Mentoring.BuilderPrototype.model.MenuItem;
import Mentoring.BuilderPrototype.model.Pasta;
import Mentoring.BuilderPrototype.model.Pizza;

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
