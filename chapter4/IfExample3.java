package chapter4;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int score;
			char grade;
			
			System.out.print("성적을 입력하세요 >> ");
			score = scn.nextInt();
			
			if (score>=90) {
				grade = 'A';
			}
			else if (score>=80) {
				grade = 'B';
			}
			else if (score>=70) {
				grade = 'C';
			}
			else if (score>=60) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			System.out.println("학생의 점수는 "+score+"이므로 "+grade+"학점입니다.");
		}
	}

}
