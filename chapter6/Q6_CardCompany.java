package chapter6;

public class Q6_CardCompany {
	private static Q6_CardCompany instance = new Q6_CardCompany();

	private Q6_CardCompany() {
	}

	public static Q6_CardCompany getInstance() {
		if (instance == null)
			instance = new Q6_CardCompany();
		return instance;
	}

	public Q6_Card createCard() {

		Q6_Card card = new Q6_Card();
		return card;
	}
}
