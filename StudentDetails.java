package sample;

public class StudentDetails implements Comparable<StudentDetails>{
	
	int id;
	String StudentName;
	int marks;
	

	public StudentDetails(int id, String studentName, int marks) {
		super();
		this.id = id;
		StudentName = studentName;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", StudentName=" + StudentName + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(StudentDetails arg0) {
		// TODO Auto-generated method stub
		return this.marks-arg0.marks;
	}

}
