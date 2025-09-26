package Sesi2.main;

import Sesi2.factory.Factory;
import Sesi2.factory.MenuItem;
import Sesi2.singleton.Database;

public class Main {

	public Main() {
		Database db1 = Database.getInstance();
		Database db2 = Database.getInstance();
		
		System.out.println(db1 == db2);
		
		Factory factory = new Factory();
		
		MenuItem pizza = factory.getFood("pizza", "spicy", 50000);
		MenuItem pasta = factory.getFood("pasta", "ori", 30000);
		
		pizza.isCooking();
		pasta.isCooking();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
