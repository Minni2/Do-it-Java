package chapter5;

public class ManTest {

	public static void main(String[] args) {
		Man man = new Man();
		man.age = 40;
		man.name = "James";
		man.isMarried = true;
		man.baby = 3;
		
		System.out.println("���� : "+man.age);
		System.out.println("�̸� : "+man.name);
		System.out.println("��ȥ ���� : "+man.isMarried);
		System.out.println("�ڳ� : "+man.baby);
	}

}
