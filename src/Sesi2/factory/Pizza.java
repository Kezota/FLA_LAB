package Sesi2.factory;

public class Pizza extends MenuItem{

	private String flavour;
	private Integer price;
	
	public Pizza(String flavour, Integer price) {
		super();
		this.flavour = flavour;
		this.price = price;
	}

	@Override
	public void isCooking() {
		// TODO Auto-generated method stub
		System.out.println("Pizza is being cooked");
	}
	
}
