package chapter6;

public class StudentTest1 {
	public static void main(String[] args) {
		Student_ studentLee = new Student_();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student_ studentSon = new Student_();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
