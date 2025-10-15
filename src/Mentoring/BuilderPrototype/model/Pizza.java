package Mentoring.BuilderPrototype.model;

public class Pizza extends MenuItem {

	private String flavour;
	private Integer price;
	private String veggie;
	
	public Pizza(String flavour, Integer price, String veggie) {
		super();
		this.flavour = flavour;
		this.price = price;
		this.veggie = veggie;
	}

	@Override
	public void isCooking() {
		System.out.println("Pizza is being cooked");
	}

	@Override
	public String toString() {
		return "Pizza{" +
				"flavour='" + flavour + '\'' +
				", price=" + price +
				", veggie='" + veggie + '\'' +
				'}';
	}
}
