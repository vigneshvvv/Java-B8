package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;



public class ObjectFilterExcercise {
	
	public static List<EmployeeDataBase> generateEmployee(){
		List<EmployeeDataBase> bases = new ArrayList<EmployeeDataBase>();
		EmployeeDataBase base = new EmployeeDataBase(1, "Sathish", true, 40000, 25, "Chennai");
		EmployeeDataBase base1 = new EmployeeDataBase(2, "Rahul", true, 50000, 27, "Madurai");
		EmployeeDataBase base2 = new EmployeeDataBase(3, "Revanth", true, 80000, 23, "Trichy");
		EmployeeDataBase base3 = new EmployeeDataBase(4, "Guru", false, 20000, 21, "Delhi");
		EmployeeDataBase base4 = new EmployeeDataBase(5, "Deva", true, 90000, 27, "Chennai");
		bases.add(base);
		bases.add(base1);
		bases.add(base2);
		bases.add(base3);
		bases.add(base4);
		return bases;
		
	}
	
	public static void groupByPlace(List<EmployeeDataBase> emp) {
		
	  Map<String, Long> filtered = 	emp.stream().collect(Collectors
				.groupingBy(EmployeeDataBase::getPlace, Collectors.counting()));
	  System.out.println(filtered);
	}
	
	
	public static EmployeeDataBase getS(EmployeeDataBase e) {
		if(e.getSalary() < 50000) {
			return e;
		}else {
			return null;
		}
		
		
	}
	
	public static List<EmployeeDataBase> filterBySalaryStream(List<EmployeeDataBase> bases){
	List<EmployeeDataBase> fl=bases.stream().filter(e -> e.getSalary() < 50000).collect(Collectors.toList());
	System.out.println(fl);
	return fl;
	}
	
	public static Boolean  lessThan50K(EmployeeDataBase e) {
		return e.getSalary() < 50000;
	}
	
	public static List<String> filterBySalaryMapStream(List<EmployeeDataBase> bases){
		List<String> fl=bases.stream().filter(e -> e.getSalary() < 50000)
				.map(e -> e.getEmployeeName())
				.collect(Collectors.toList());
		
		
//		List<String> fl=bases.stream().filter(Main:: lessThan50K)
//		.map(EmployeeDataBase::getEmployeeName)
//		.collect(Collectors.toList());
//		
//		System.out.println(fl);
		return fl;
		}
	
	public static void mapPreparation(List<EmployeeDataBase> db) {
		
		Map<String, EmployeeDataBase> empDB =   db.stream()
		.collect(Collectors.toMap(EmployeeDataBase::getEmployeeName, emp -> emp));
		
		System.out.println(empDB);
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
		
//		System.out.println(result);
			
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
		
//		System.out.println(filtered);
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
//		System.out.println(datas);
		return datas;
	}

	public static void main(String[] args) {
		
		List<EmployeeDataBase> data = generateEmployee();
		List<String> result = filterBySalary(data);
//		System.out.println(result);
		
		grouingbyPlace(data);
		placefilteration(data);
//		System.out.println(data);
		updated(result, data);
		
		filterBySalaryStream(data);
		filterBySalaryMapStream(data);
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		
		Set<Integer> output = numbers.stream().collect(Collectors.toSet());
		System.out.println(output);
		
		List<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(10);
		numbers1.add(60);
		numbers1.add(20);
		numbers1.add(30);
		
		List<Integer> asc = numbers1.stream().sorted().collect(Collectors.toList());
		System.out.println(asc); 
		
		List<Integer> Desc = numbers1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(Desc); 
		
		groupByPlace(data);
		
		mapPreparation(data);
		
		
		
	}

}
