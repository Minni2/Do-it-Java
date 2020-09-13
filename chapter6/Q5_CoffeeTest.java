package chapter6;

public class Q5_CoffeeTest {

	public static void main(String[] args) {
		Q5_Person Kim = new Q5_Person("Kim", 10000);
		Q5_Person Lee = new Q5_Person("Lee", 25000);
		Q5_StarCoffee starCoffee = new Q5_StarCoffee();
		Q5_BeanCoffee beanCoffee = new Q5_BeanCoffee();
		
		Kim.buyStarCoffee(starCoffee, 4000);
		Lee.buyBeanCoffee(beanCoffee, 4500);
	}

}
