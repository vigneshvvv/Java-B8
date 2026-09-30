package sample;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
		int a = 10;
		int b =0;
		
//		System.out.println(a/b);
		int[] arr = new int[] {10,20,30};
		System.out.println(arr[3]);
		System.out.println("Program Completed");
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Cannot find Index");
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally executed");
		}

	}

}
