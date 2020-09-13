package chapter5;

public class ManTest {

	public static void main(String[] args) {
		Man man = new Man();
		man.age = 40;
		man.name = "James";
		man.isMarried = true;
		man.baby = 3;
		
		System.out.println("³ªÀÌ : "+man.age);
		System.out.println("ÀÌ¸§ : "+man.name);
		System.out.println("°áÈ¥ ¿©ºÎ : "+man.isMarried);
		System.out.println("ÀÚ³à : "+man.baby);
	}

}
