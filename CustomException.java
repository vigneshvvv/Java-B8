package sample;


class InsufficentFundException extends Exception{
	public InsufficentFundException(String message) {
		super(message);
	}
}

public class CustomException {
	
	public static void withdraw(int amount, int balance) throws InsufficentFundException {
		if(amount > balance) {
			throw new InsufficentFundException("Insufficient fund");
		}
		System.out.println("withdraw successful");
	}

	public static void main(String[] args) throws InsufficentFundException {
		
		try {
			int amount = 10000;
			int balance = 4000;
			withdraw(amount, balance);
		}catch (InsufficentFundException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		

	}

}
