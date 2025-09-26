package Sesi2.singleton;

public class Database {

	// Eager Singleton = Lgsg dibikin di awal
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
	
	public static synchronized Database getInstance() {
		if(instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
}
