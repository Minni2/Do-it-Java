package chapter4;

public class Q4 {

	public static void main(String[] args) {
		int i, j;
		int depth = 4;

		for (i = 1; i <= depth; i++) {
			for (j = depth - i; j > 0; j--)
				System.out.print(" ");
			for (j = 0; j < i * 2 - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
