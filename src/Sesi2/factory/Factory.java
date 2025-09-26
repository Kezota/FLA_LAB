package Sesi2.factory;

public class Factory {

	public MenuItem getFood(String type, String flavour, Integer price) {
		if(type == null) {
			return null;			
		}
		
		switch (type.toLowerCase()) {
		case "pizza":
			return new Pizza(flavour, price);
		case "pasta":
			return new Pasta(flavour, price);
		default:
			return null;
		}
	}
	
}
