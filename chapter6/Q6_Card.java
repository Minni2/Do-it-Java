package chapter6;

public class Q6_Card {
		private static int serialNum = 10000;
		private int cardNum;
		
		public Q6_Card() {
			serialNum++;
			cardNum = serialNum;
		}

		public int getCardNum() {
			return cardNum;
		}

		public void setCardNum(int cardNum) {
			this.cardNum = cardNum;
		}
}
