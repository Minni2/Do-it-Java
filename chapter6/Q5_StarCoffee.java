package chapter6;

public class Q5_StarCoffee {
	int money;
	
	public String brewing(int money) {
	
		this.money += money;
		if(money == Q5_Menu.STARAMERICANO) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money == Q5_Menu.STARLATTE) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�";
		}
		else {
			return null;
		}
	}
}
