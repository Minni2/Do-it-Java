package chapter6;

public class Q6_CardCompanyTest {

	public static void main(String[] args) {
		Q6_CardCompany company = Q6_CardCompany.getInstance(); // 싱글톤 패턴

		Q6_Card myCard = company.createCard(); // 메소드에서 Car 생성
		Q6_Card yourCard = company.createCard();

		System.out.println(myCard.getCardNum()); // 10001 출력
		System.out.println(yourCard.getCardNum()); // 10002 출력
	}
}
