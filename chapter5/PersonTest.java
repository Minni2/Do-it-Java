package chapter5;

public class PersonTest {

	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "������";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;

		Person personLee = new Person("�̼���", 175, 75);
		
		System.out.println("�̸� : "+personKim.name);
		System.out.println("������ : "+personKim.weight);
		System.out.println("Ű : "+personKim.height);
		
		System.out.println("�̸� : "+personLee.name);
		System.out.println("������ : "+personLee.weight);
		System.out.println("Ű : "+personLee.height);
	}

}
