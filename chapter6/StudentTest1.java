package chapter6;

public class StudentTest1 {
	public static void main(String[] args) {
		Student_ studentLee = new Student_();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student_ studentSon = new Student_();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
