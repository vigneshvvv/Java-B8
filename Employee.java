package sample;

abstract class Employee {
	
	String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	abstract double calculateSalary();
	
	void login() {
		System.out.println(name + "logged in");
	}

}
