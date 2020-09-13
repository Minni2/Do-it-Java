package chapter4;

public class Q3 {

	public static void main(String[] args) {
		int i, j;

		for (i = 2; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				if (i <= j)
					break;
				System.out.println(i + "X" + j + "=" + i * j);
			}
			System.out.println();
		}
	}
}
