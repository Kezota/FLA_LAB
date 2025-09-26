package Sesi1.model;

public class DebitPayment extends Payment implements IsCashless{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Payment made with debit");
	}

	@Override
	public void sendEmailReceipt() {
		// TODO Auto-generated method stub
		System.out.println("Debit receipt sent to your email");
	}

	
}
