package sample;

public class Intro {

	public static void main(String[] args) {
		int id = 10;
		String firstName = "Vignesh" ;
		Boolean isAvailable = true;
		System.out.println(id);
		id = 20;
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(isAvailable);
		
		int a = 240;
		int b = 240;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%2);
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a >= b);
		System.out.println("Less than or Equal To Operation"+ (a <= b));
		
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
//		 a += 1;
//		 a -= 1;
		 
//		System.out.println("a++ operation"+ a++);
		System.out.println("a++ operation"+ ((a++)+b));
		System.out.println(a);
		 System.out.println("++a operation" + ++a);
		 
		 int num1 = 30;
		 int num2 = 20;
		 
		 if(num1 == num2) {
			 System.out.println("Both numbers are equal");
		 }
		 else if(num1 > num2) {
			 System.out.println("num1 is greater than num2");
		 }
		 else if(num1 < num2) {
			 System.out.println("num1 is less than num2");
		 }
		 else {
			 System.out.println("Both numbers are not equal");
		 }
		 
		 

	}

}
