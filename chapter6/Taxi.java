package chapter6;

public class Taxi {
	String taxiNumber;
	int money;
	
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(taxiNumber+" ������ "+money+"�Դϴ�.");
	}
}
