package sample;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(20);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(40);
		
		System.out.println(set);
		set.remove(20);
		System.out.println(set);
		
		System.out.println(set.contains(40));
		set.clear();
		System.out.println(set);
		
		
		Set<Integer> a = new HashSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		Set<Integer> b = new HashSet<Integer>();
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		
		Set<Integer> un = new HashSet<>(a);
		un.addAll(b);
		System.out.println(un);
		
		
		
		Set<Integer> diff = new HashSet<>(a);
		diff.removeAll(b);
		System.out.println(diff);
		
		System.out.println(a.equals(b));
		
		for(Integer num: a) {
			System.out.println(num);
		}
		
		Set<Integer> inter = new HashSet<>(a);
		inter.retainAll(b);
		System.out.println(inter);
		
		
		
		
		
		

	}

}
