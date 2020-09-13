package chapter4;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int floor;
			String place;

			System.out.print("가실 층 수를 눌러주세요 >>");
			floor = scn.nextInt();

			switch (floor) {
			case 1:
				place = "약국";
				break;
			case 2:
				place = "정형외과";
				break;
			case 3:
				place = "피부과";
				break;
			case 4:
				place = "치과";
				break;
			case 5:
				place = "헬스 클럽";
				break;
			default:
				place = "존재하지 않는";
			}
			System.out.println("선택하신 " + floor + "층은 " + place + "입니다.");
		}
	}

}
