package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		Student studentYeo = new Student();
//		studentYeo.studentName = "���¹�";
		studentYeo.setStudentName("���¹�");

//		System.out.println(studentYeo.studentName);
		System.out.println(studentYeo.getStudentName());

//		Student student1 = new Student();
//		student1.studentName = "���¹�";
//		System.out.println(student1.getStudentName());
//
//		Student student2 = new Student();
//		student2.studentName = "���¿�";
//		System.out.println(student2.getStudentName());
	}

}
