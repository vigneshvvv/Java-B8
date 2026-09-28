package sample;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparablePrac {
	
	public static List<StudentDetails> generateStudentData(){
		List<StudentDetails> details = new ArrayList<StudentDetails>();
		details.add(new StudentDetails(1, "Arun", 300));
		details.add(new StudentDetails(2, "Rahul", 420));
		details.add(new StudentDetails(3, "Deva", 400));
		return details;
		
	}
	
	
	public static void main(String[] args) {
		
		ComparablePrac comparablePrac = new ComparablePrac();
		
		List<StudentDetails> details = comparablePrac.generateStudentData();
		Collections.sort(details);
		System.out.println(details);
		
		
	    List<StudentDetails> filtered = new ArrayList<>();
		for(StudentDetails details2: details) {
			if(details2.getMarks() > 350) {
				filtered.add(details2);
			}
			
		}
		System.out.println("Data by for loop"+ filtered);		
		List<StudentDetails> data = details.stream().filter(n -> n.getMarks() > 350)
				.collect(Collectors.toList());
		
		System.out.println("Data by stream"+ data);	
		
		List<StudentDetails> filteredN = new ArrayList<>();
		
		details.forEach((e) -> {
			if(e.getMarks() > 350) {
				filteredN.add(e);
			}
		});
		
		System.out.println("Data by forEach"+ filteredN);	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
