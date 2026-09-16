package sample;

public class ContractEmployee extends Employee {

	public ContractEmployee(String name) {
		super(name);
	}

	@Override
	double calculateSalary() {
		return 30000;
	}

}
