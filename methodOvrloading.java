package sample;

public class methodOvrloading {
	
	public static int multiplication(int a, int b) {
		return a*b;
	}
	
	public static int multiplication(int a, int b, int c) {
		return a*b*c;
	}

	public static void main(String[] args) {
		int result = multiplication(10, 20);
		int result1 = multiplication(10, 20, 30);
		System.out.println(result);
		System.out.println(result1);

	}

}
