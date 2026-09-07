package sample;
import java.util.ArrayList;
import java.util.*;

public class ListPrac {
	
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(10);
		ls.add(20);
//		System.out.println(ls.get(3));
		System.out.println(ls.contains(10));
		System.out.println(ls.indexOf(20));
		System.out.println( ls.size());
		List<Integer> ls1 = new ArrayList<>();
		if(!ls1.isEmpty()) {
			System.out.println(ls1.get(0));
		}else {
			System.out.println("list is empty");
		}
		
//		ls.remove(0);
//		ls.toString();
		
//		ls.clear();
		System.out.println(ls);
		
		ls.set(1, 30);
		System.out.println(ls);
		ls.add(1,20);
		System.out.println(ls);
		
	}

}
