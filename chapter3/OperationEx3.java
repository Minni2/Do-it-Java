package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;

		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // �� ������ �� ���� �����̸� �� ���� ������� �ʾ� i ���� �״��

		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // �� �տ��� �� ���� ���̸� �� ���� ������� �ʾ� i ���� �״��

		int num = 5;
		int j = 10;

		boolean value_ = ((num = num * 10) > 45) || ((j = j - 10) < 10);
		System.out.println(value_);
		System.out.println(num);
		System.out.println(i); // �� �տ��� �� ���� ���̸� �� ���� ������� �ʾ� i ���� �״��
	}

}
