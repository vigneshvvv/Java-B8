package sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ObjectCreation {
	
	
	public static List<ProductInfo> generateProductInfo(){
		List<Specification> specifications = new ArrayList<Specification>();
 		
		Specification specification = new Specification(4, 64);
		Specification specification2 = new Specification(6, 128);
		specifications.add(specification);
		specifications.add(specification2);
		
		ProductInfo info = new ProductInfo(1, "Samsung", 20000, specifications);
		System.out.println(info);
		
		List<Specification> specifications1 = new ArrayList<Specification>();
 		
		Specification specification3 = new Specification(6, 64);
		Specification specification4 = new Specification(7, 128);
		specifications1.add(specification3);
		specifications1.add(specification4);
		ProductInfo info2 = new ProductInfo(2, "Nothing 2a", 40000, specifications1);
		
		List<ProductInfo> infos = new ArrayList<ProductInfo>();
		infos.add(info);
		infos.add(info2);
		return infos;
	}
	
	
	public static Set<ProductInfo> filterProduct(List<ProductInfo> products){
		
		Set<ProductInfo> result = new HashSet<ProductInfo>();
		for(ProductInfo product: products) {
			for(Specification spec: product.getSpecification()) {
				if(spec.getRAM() > 6) {
					result.add(product);
				}
			}
			
		}
		return result;
	}
	

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
		
		
		List<ProductInfo> products= generateProductInfo();
		
		Set<ProductInfo> result = filterProduct(products);
		System.out.println("The filtered products are"+ result);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
