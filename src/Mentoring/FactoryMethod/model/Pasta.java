package Mentoring.FactoryMethod.model;

public class Pasta extends MenuItem {

	private String flavour;
	private Integer price;
	private String veggie;
	
	public Pasta(String flavour, Integer price, String veggie) {
		super();
		this.flavour = flavour;
		this.price = price;
		this.veggie = veggie;
	}

	@Override
	public void isCooking() {
		// TODO Auto-generated method stub
		System.out.println("Pasta is being cooked");
	}

	@Override
	public String toString() {
		return "Pasta{" +
				"flavour='" + flavour + '\'' +
				", price=" + price +
				", veggie='" + veggie + '\'' +
				'}';
	}
}
