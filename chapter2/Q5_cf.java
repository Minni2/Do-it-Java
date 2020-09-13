package chapter2;

public class Q5_cf {

	public static void main(String[] args) {
		char ch1 = '\uC5EC';
		char ch2 = '\uC2B9';
		char ch3 = '\uBBFC';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.print(ch1);
		System.out.print(ch2);
		System.out.println(ch3);
		
		System.out.println("성은 "+ch1+"이고 이름은 "+ch2+ch3+"입니다.");
	}

}
