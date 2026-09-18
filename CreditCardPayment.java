package sample;

public class CreditCardPayment implements Payment, SampleInterface {

	@Override
	public void pay() {
		System.out.println("Credit Card Payment Done");	
	}

	@Override
	public void methodA() {
		System.out.println("Method A Executed");
		
	}

}
