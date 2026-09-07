package sample;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetPrac {

	public static void main(String[] args) {
		LinkedHashSet<Integer> nums = new LinkedHashSet<>();
		
		nums.add(10);
		nums.add(20);
		nums.add(10);
		nums.add(30);
		nums.add(40);
		System.out.println(nums);
		
		nums.remove(10);
		nums.size();
		nums.isEmpty();
		nums.clear();
		
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(20);
		numbers.add(10);
		numbers.add(20);
		numbers.add(5);
		numbers.add(10);
		numbers.add(30);
		System.out.println(numbers);
		
		System.out.println(numbers.first());
		System.out.println(numbers.last());
		
		
		
		

	}

}
