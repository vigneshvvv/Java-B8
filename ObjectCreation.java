package sample;

import java.util.ArrayList;
import java.util.List;

public class ObjectCreation {

	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.setId(1);
		emp1.setEmployeeName("Deva");
		emp1.setIsActive(true);
		
		EmployeeDetails emp2 = new EmployeeDetails();
		emp2.setId(2);
		emp2.setEmployeeName("Sathish");
		emp2.setIsActive(false);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
//		ProductInfo info = new ProductInfo(1, "Vivo Mobiles", 20000);
//		System.out.println(info.getProductName());
//		System.out.println(info);
//
//		ProductInfo info2 = new ProductInfo();
//		info2.setId(2);
//		info2.setPrice(20000);
//		info2.setProductName("Samsung");
		
		List<Specification> specifications = new ArrayList<Specification>();
 		
		Specification specification = new Specification(4, 64);
		Specification specification2 = new Specification(6, 128);
		specifications.add(specification);
		specifications.add(specification2);
		
		ProductInfo info = new ProductInfo(1, "Samsung", 20000, specifications);
		System.out.println(info);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
