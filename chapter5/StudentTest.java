package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		Student studentYeo = new Student();
//		studentYeo.studentName = "¿©½Â¹Î";
		studentYeo.setStudentName("¿©½Â¹Î");

//		System.out.println(studentYeo.studentName);
		System.out.println(studentYeo.getStudentName());

//		Student student1 = new Student();
//		student1.studentName = "¿©½Â¹Î";
//		System.out.println(student1.getStudentName());
//
//		Student student2 = new Student();
//		student2.studentName = "¿©½Â¿ø";
//		System.out.println(student2.getStudentName());
	}

}
