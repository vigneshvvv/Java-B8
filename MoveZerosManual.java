package sample;

import java.util.Arrays;

public class MoveZerosManual {

	public static void main(String[] args) {
		int[] arr = new int[] {0,1,0,3,12};
		int[] result = new int[arr.length];
		int size = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				result[size] = arr[i];
				size++;
			}
			
		}
		
		for(int i = size+1; i < result.length; i++) {
			result[i] = 0;
		}
		
		System.out.println(Arrays.toString(result));

	}

}
