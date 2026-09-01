package sample;

public class Arrays {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] arr1 = new int[] {10,20,30,40,50};
		
		System.out.println(java.util.Arrays.toString(arr));
		System.out.println(java.util.Arrays.toString(arr1));
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		arr[0] = 600;
		System.out.println(java.util.Arrays.toString(arr));
		
		System.out.println(arr.length);
		

	}

}
