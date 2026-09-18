package sample;

public class AbstractMain {

	public static void main(String[] args) {
		PermentEmployee employee = new PermentEmployee("Vignesh");
		System.out.println( employee.calculateSalary());
		employee.login();
		
		ContractEmployee contractEmployee = new ContractEmployee("Arun");
		System.out.println(contractEmployee.calculateSalary());
		contractEmployee.login();
	}

}
