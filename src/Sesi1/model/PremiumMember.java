package Sesi1.model;

import java.util.ArrayList;

public class PremiumMember extends Member{

	public PremiumMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void getRecommendation(ArrayList<Book> booklist) {
		Book recBook = booklist.get(0);
		System.out.println("Read this exciting book");
		System.out.println(recBook.getTitle() + " by " + recBook.getAuthor());
	}
	
	
	@Override
	public void borrowBook(Book book) {
		// TODO Auto-generated method stub
		if(book.isAvailable() == true) {
			System.out.println("Premium Member " + this.name + " has borrowed " + book.getTitle());
			book.setAvailable(false);
		}
		else {
			System.out.println("Book is not available");
			System.out.println("So sorry to hear that, please try our recommendation feature!");
		}
	}
}
