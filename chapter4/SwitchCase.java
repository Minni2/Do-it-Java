package chapter4;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColar;

		switch (ranking) {
		case 1:
			medalColar = 'G';

			break;
		case 2:
			medalColar = 'S';

			break;
		case 3:
			medalColar = 'B';

			break;
		default:
			medalColar = 'A';
			break;
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColar + "입니다.");
	}

}
