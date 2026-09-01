package sample;

public class ForLoop {

	public static void main(String[] args) {
		int[] arr = new int[] {100,200,300,400,500};
		
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
//		increase i by 2
		for(int i =0; i < arr.length; i+=2) {
			System.out.println(arr[i]);
		}
		
		for(int a: arr) {
			System.out.println(a);
		}

	}

}
