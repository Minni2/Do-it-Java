package chapter6;

public class Q5_BeanCoffee {
	int money;
	
	public String brewing(int money) {
	
		this.money += money;
		if(money == Q5_Menu.BEANAMERICANO) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money == Q5_Menu.BEANLATTE) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�";
		}
		else {
			return null;
		}
	}
}
