package sample;

public class PermentEmployee extends Employee {

	public PermentEmployee(String name) {
		super(name);
	}

	@Override
	double calculateSalary() {
		return 50000;
	}
	
	

}
