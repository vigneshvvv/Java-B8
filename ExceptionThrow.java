package sample;

public class ExceptionThrow {
	
	public static void main(String[] args) {
		int age= 17;
		
		if(age < 18) {
			throw new IllegalArgumentException("Age cannot be less than 17");
		}
		
		System.out.println("Eligible");
	}

}
