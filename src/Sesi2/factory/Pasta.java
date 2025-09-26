package Sesi2.factory;

public class Pasta extends MenuItem{

	private String flavour;
	private Integer price;
	
	public Pasta(String flavour, Integer price) {
		super();
		this.flavour = flavour;
		this.price = price;
	}

	@Override
	public void isCooking() {
		// TODO Auto-generated method stub
		System.out.println("Pasta is being cooked");
	}
	
	
}
