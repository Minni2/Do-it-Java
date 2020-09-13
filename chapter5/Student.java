package chapter5;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;

//	public void showStudentInfo() {
//		System.out.println(studentName + ", " + address);
//	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
//	public static void main(String[] args) {
//		Student studentYeo = new Student();
//		studentYeo.studentName = "¿©½Â¹Î";
//		
//		System.out.println(studentYeo.studentName);
//		System.out.println(studentYeo.getStudentName());
//	}
}
