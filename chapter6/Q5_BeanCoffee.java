package chapter6;

public class Q5_BeanCoffee {
	int money;
	
	public String brewing(int money) {
	
		this.money += money;
		if(money == Q5_Menu.BEANAMERICANO) {
			return "콩 다방 아메리카노를 구입했습니다";
		}
		else if(money == Q5_Menu.BEANLATTE) {
			return "콩 다방 라떼를 구입했습니다";
		}
		else {
			return null;
		}
	}
}
