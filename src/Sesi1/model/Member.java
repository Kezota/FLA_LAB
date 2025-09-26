package Sesi1.model;

public class Member {

	protected String name;

	public Member(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void borrowBook(Book book) {
		
		if(book.isAvailable() == true) {
			System.out.println("Member " + this.name + " has borrowed " + book.getTitle());
			book.setAvailable(false);
		}
		else {
			System.out.println("Book is not available");
		}
		
	}
	
	public void returnBook(Book book) {
		System.out.println("Member " + this.name + " has returned " + book.getTitle());
		book.setAvailable(true);
	}
}
