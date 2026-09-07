package sample;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr = new int[] {0,1,0,3,12};
		
		int k =1;
		int startPointer = 0;
		
		if(arr.length ==1) {
			return;
		}
		
		while(k < arr.length) {
			if(arr[startPointer] == 0 && arr[k] != 0) {
				int temp = arr[startPointer];
				arr[startPointer] = arr[k];
				arr[k] = temp;
			} else if(arr[startPointer] == 0 && arr[k] == 0) {
				k++;
			}else {
				startPointer++;
				k++;
			}
				
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
