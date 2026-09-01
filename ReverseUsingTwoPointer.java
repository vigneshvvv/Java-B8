package sample;

import java.util.Arrays;

public class ReverseUsingTwoPointer {

	public static void main(String[] args) {
		int[] arr = new int[] {120,121,122,123,124,125};
		int start = 0;
		int end = arr.length-1;
		
		for (int i =0; start < end; i++) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
