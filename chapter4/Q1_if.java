package chapter4;

public class Q1_if {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		if (operator == '+') {
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		}
		else if (operator == '-') {
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		}
		else if (operator == '*') {
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		}
		else if (operator == '/') {
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		}
		else {
			System.out.println("없는 연산자입니다.");
		}

	}

}
