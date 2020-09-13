package chapter4;

public class Q1_switch {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '/';

		switch (operator) {
		case '+':
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case '/':
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			break;
		default:
			System.out.println("없는 연산자입니다.");
		}
	}

}
