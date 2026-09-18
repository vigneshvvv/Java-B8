package sample;

class EmployeeData{
	int employeeId;
	String emp_name;
	int salary;
	public EmployeeData(int employeeId, String emp_name, int salary) {
		super();
		this.employeeId = employeeId;
		this.emp_name = emp_name;
		this.salary = salary;
	}
	
	
}

class Developer extends EmployeeData{
	String techSkills;
	public Developer(int employeeId, String emp_name, int salary, String techSkills ) {
		super(employeeId, emp_name, salary);
		this.techSkills = techSkills;
	}
	@Override
	public String toString() {
		return "Developer [techSkills=" + techSkills + ", employeeId=" + employeeId + ", emp_name=" + emp_name
				+ ", salary=" + salary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}


class Tester extends EmployeeData{
	String frameWorksknown;

	public Tester(int employeeId, String emp_name, int salary, String frameWorksknown) {
		super(employeeId, emp_name, salary);
		this.frameWorksknown = frameWorksknown;
	}

	@Override
	public String toString() {
		return "Tester [frameWorksknown=" + frameWorksknown + ", employeeId=" + employeeId + ", emp_name=" + emp_name
				+ ", salary=" + salary + "]";
	}
	
	
}

public class InheritanceExample {
	
	public static void main(String[] args) {
		Developer developer = new Developer(1, "Vignesh", 50000, "Java");
		System.out.println(developer);
		
		Tester tester = new Tester(2, "Vignesh", 60000, "Junit,Jmeter");
		System.out.println(tester);
		
	}

}
