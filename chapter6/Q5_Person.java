package chapter6;

public class Q5_Person {
	String name;
	int money;

	Q5_Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void buyStarCoffee(Q5_StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(4000);
		if (message != null) {
			this.money -= money;
			System.out.println(name + " ¥‘¿Ã " + money + "¿∏∑Œ " + message);
		}
	}

	public void buyBeanCoffee(Q5_BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4500);
		if (message != null) {
			this.money -= money;
			System.out.println(name + " ¥‘¿Ã " + money + "¿∏∑Œ " + message);
		}
	}
}
