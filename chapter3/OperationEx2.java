package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		int lastScore1_1 = gameScore++;
		System.out.println(lastScore1_1);
		
		int lastScore2_1 = gameScore--;
		System.out.println(lastScore2_1);
		
		System.out.println(gameScore);
	}

}
