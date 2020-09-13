package chapter2;

public class CharacterEx3 {

	public static void main(String[] args) {
		int a = 65;
		int b = -66;
		
		char a2 = 65;
//		char b2 = -66;		//문자형 변수에 음수를 넣으면 오류 발생
		
		System.out.println((char)a);
		System.out.println((char)b);
		//음수 값을 대입한 변수 b를 char형으로 출력해보면 ?로 출력 > 알 수 없는 문자라는 의미
		System.out.println(a2);
//		System.out.println(b2);
	}

}
