package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		int i = 10;				//var i = 10
		double j = 10.0;		//var j = 10.0
		String str = "Hello";	//var str = "Hello"
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

		str = "test";	//다른 문자열 대입 가능
//		str = 3;		//str 변수는 String형으로 먼저 사용 > 정수 값 대입 X
		System.out.println(str);
	}

}
