package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice {
	
	int id;
	String name;
	int age;
	int marks;
	
	public ComparatorPractice(int id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "ComparatorPractice [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		
		ComparatorPractice practice = new ComparatorPractice(1, "Sathish", 20, 420);
		ComparatorPractice practice1 = new ComparatorPractice(2, "Arun", 24, 380);
		ComparatorPractice practice2 = new ComparatorPractice(1, "Rahul", 22, 460);
		
		List<ComparatorPractice> prac = new ArrayList<>();
		prac.add(practice);
		prac.add(practice1);
		prac.add(practice2);
		
		Comparator<ComparatorPractice> markComparator =new Comparator<ComparatorPractice>() {
			
			@Override
			public int compare(ComparatorPractice arg0, ComparatorPractice arg1) {
				return arg0.marks- arg1.marks;
			}
		};
		
		Comparator<ComparatorPractice> ageComparator = (a,b) -> a.age-b.age;
		
		Collections.sort(prac, markComparator);
		
		System.out.println(prac);
		
		Collections.sort(prac,ageComparator);
		System.out.println(prac);
		
		Collections.sort(prac, (a,b) -> b.age-a.age);
		System.out.println(prac);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
