package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectFilterExcercise {
	
	public static List<EmployeeDataBase> generateEmployee(){
		List<EmployeeDataBase> bases = new ArrayList<EmployeeDataBase>();
		EmployeeDataBase base = new EmployeeDataBase(1, "Sathish", true, 40000, 25, "Chennai");
		EmployeeDataBase base1 = new EmployeeDataBase(2, "Rahul", true, 50000, 27, "Madurai");
		EmployeeDataBase base2 = new EmployeeDataBase(3, "Revanth", true, 80000, 23, "Trichy");
		EmployeeDataBase base3 = new EmployeeDataBase(4, "Guru", false, 20000, 21, "Delhi");
		EmployeeDataBase base4 = new EmployeeDataBase(5, "Deva", true, 90000, 29, "Chennai");
		bases.add(base);
		bases.add(base1);
		bases.add(base2);
		bases.add(base3);
		bases.add(base4);
		return bases;
		
	}
	
	
	public static List<String> filterBySalary(List<EmployeeDataBase> bases){
		
		List<String> names = new ArrayList<>();
		for(EmployeeDataBase base: bases) {
			if(base.getSalary() < 50000) {
				names.add(base.getEmployeeName());
			}
		}
		return names;
	}
	
	public static void grouingbyPlace(List<EmployeeDataBase> bases) {
		Map<String, Integer> result = new HashMap<String, Integer>();
		
		for(EmployeeDataBase base: bases) {
			if(result.get(base.getPlace()) == null) {
				result.put(base.getPlace(), 1);
			}else {
				result.put(base.getPlace(), result.get(base.getPlace())+1);
			}
		}
		
		System.out.println(result);
			
	}
	
	public static void placefilteration(List<EmployeeDataBase> emps) {
		Map<String, List<EmployeeDataBase>> filtered = new HashMap<>();
		
		for(EmployeeDataBase base: emps) {
			if(filtered.get(base.getPlace()) == null) {
				List<EmployeeDataBase> data= new ArrayList<>();
				data.add(base);
				filtered.put(base.getPlace(), data);
			}else {
				List<EmployeeDataBase> ex = filtered.get(base.getPlace());
				ex.add(base);
				filtered.put(base.getPlace(), ex);
			}
		}
		
		System.out.println(filtered);
	}
	
	public static List<EmployeeDataBase> updated(List<String> names, List<EmployeeDataBase> datas){
		int position = 0;
		int capacity = names.size();
		
		while(position < capacity) {
			for(EmployeeDataBase base: datas) {
				if(base.getEmployeeName() == names.get(position)) {
					base.setSalary(base.getSalary()+10000);
				}
			}
			position++;
		}
		System.out.println(datas);
		return datas;
	}

	public static void main(String[] args) {
		
		List<EmployeeDataBase> data = generateEmployee();
		List<String> result = filterBySalary(data);
		System.out.println(result);
		
		grouingbyPlace(data);
		placefilteration(data);
		System.out.println(data);
		updated(result, data);
		

	}

}
