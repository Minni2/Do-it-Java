package chapter4;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int floor;
			String place;

			System.out.print("���� �� ���� �����ּ��� >>");
			floor = scn.nextInt();

			switch (floor) {
			case 1:
				place = "�౹";
				break;
			case 2:
				place = "�����ܰ�";
				break;
			case 3:
				place = "�Ǻΰ�";
				break;
			case 4:
				place = "ġ��";
				break;
			case 5:
				place = "�ｺ Ŭ��";
				break;
			default:
				place = "�������� �ʴ�";
			}
			System.out.println("�����Ͻ� " + floor + "���� " + place + "�Դϴ�.");
		}
	}

}
