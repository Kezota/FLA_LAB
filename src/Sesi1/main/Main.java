package Sesi1.main;

import java.util.ArrayList;

import Sesi1.model.Book;
import Sesi1.model.CashPayment;
import Sesi1.model.CreditPayment;
import Sesi1.model.DebitPayment;
import Sesi1.model.Member;
import Sesi1.model.Payment;
import Sesi1.model.PremiumMember;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

	
	public Main() {
		// TODO Auto-generated constructor stub
		System.out.println("REVIEW OOP");
		
		ArrayList<Book> bookList = new ArrayList<>();
		Book book1 = new Book("Harry Potter", "JK Rowling", true);
		
		bookList.add(book1);
		bookList.add(new Book("Bobo", "Budi", true));
		bookList.add(new Book("Hunger Games", "Hady", true));
		
		System.out.println("Book 1 Author: " + book1.getAuthor());
		
		Member member1 = new Member("Ari");
		Member member2 = new PremiumMember("Shandy");
		
		member1.borrowBook(bookList.get(1));
		member2.borrowBook(bookList.get(1));
		((PremiumMember)member2).getRecommendation(bookList);
		
		Payment p1 = new CashPayment();
		Payment p2 = new DebitPayment();
		CreditPayment p3 = new CreditPayment();
		
		p1.pay();
		p2.pay();
		p3.pay();
		
		((DebitPayment)p2).sendEmailReceipt();
		p3.sendEmailReceipt();
	}
	
	
	
}
