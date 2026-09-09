package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Methods {
	
	
	public static List<Integer> listCreation() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		System.out.println(numbers);
		return numbers;
	}
	
	public static void checkNumber(List<Integer> sample, int a) {
		if(sample.isEmpty()) {
			System.out.println("Ths list is empty");
			return;
		}
		
		System.out.println("list is not empty"+ sample);
	}

	public static void main(String[] args) {
		List<Integer> lst = listCreation();
		System.out.println(lst.contains(20)); 
		checkNumber(lst, 10);

		
		
		
		
		
		
		
		
		
		
		
	}

}
