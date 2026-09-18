package sample;

public class EmployeeDataBase {
		
		private int id;
		private String employeeName;
		private Boolean isActive;
		private int salary;
		private int age;
		private String place;
		public EmployeeDataBase(int id, String employeeName, Boolean isActive, int salary, int age, String place) {
			super();
			this.id = id;
			this.employeeName = employeeName;
			this.isActive = isActive;
			this.salary = salary;
			this.age = age;
			this.place = place;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public Boolean getIsActive() {
			return isActive;
		}
		public void setIsActive(Boolean isActive) {
			this.isActive = isActive;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		@Override
		public String toString() {
			return "EmployeeDataBase [id=" + id + ", employeeName=" + employeeName + ", isActive=" + isActive
					+ ", salary=" + salary + ", age=" + age + ", place=" + place + "]";
		}
		
		

}
