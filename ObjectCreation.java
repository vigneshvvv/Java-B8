package sample;

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

	}

}
