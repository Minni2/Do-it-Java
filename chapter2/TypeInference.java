package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		int i = 10;				//var i = 10
		double j = 10.0;		//var j = 10.0
		String str = "Hello";	//var str = "Hello"
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

		str = "test";	//�ٸ� ���ڿ� ���� ����
//		str = 3;		//str ������ String������ ���� ��� > ���� �� ���� X
		System.out.println(str);
	}

}
