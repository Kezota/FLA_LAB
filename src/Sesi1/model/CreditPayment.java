package Sesi1.model;

public class CreditPayment extends Payment implements IsCashless{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Payment made with credit");
	}

	@Override
	public void sendEmailReceipt() {
		// TODO Auto-generated method stub
		System.out.println("Credit receipt sent to your email");
	}

	
}
