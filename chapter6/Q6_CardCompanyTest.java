package chapter6;

public class Q6_CardCompanyTest {

	public static void main(String[] args) {
		Q6_CardCompany company = Q6_CardCompany.getInstance(); // �̱��� ����

		Q6_Card myCard = company.createCard(); // �޼ҵ忡�� Car ����
		Q6_Card yourCard = company.createCard();

		System.out.println(myCard.getCardNum()); // 10001 ���
		System.out.println(yourCard.getCardNum()); // 10002 ���
	}
}
