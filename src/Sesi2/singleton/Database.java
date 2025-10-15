package Sesi2.singleton;

import Sesi2.factory.MenuItem;

import java.util.Vector;

public class Database {

	// Eager Singleton = Lgsg dibikin di awal -> YG DIPAKE DI QUIZ INI
//	private static final Database instance = new Database();
//	
//	public Database() {
//		System.out.println("Database is Connected");
//	}
//
//	public static Database getInstance() {
//		return instance;
//	}
	
	
	// Lazy Singleton
//	private static Database instance;
//	
//	public static Database getInstance() {
//		if(instance == null) {
//			instance = new Database();
//		}
//		return instance;
//	}
	
	
	// Threadsafe Singleton
	private static Database instance;
	private Vector<MenuItem> menuItems;
	
	public static synchronized Database getInstance() {
		if(instance == null) {
			instance = new Database();
		}
		return instance;
	}

	private Database() {
		menuItems = new Vector<MenuItem>();
		System.out.println("Database is Connected");
	}

	public void addMenuItem(MenuItem item) {
		menuItems.add(item);
	}

	public Vector<MenuItem> getMenuItems() {
		return menuItems;
	}
}
