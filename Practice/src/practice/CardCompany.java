package practice;

public class CardCompany {
	public static int serialNum = 10000;
	private static CardCompany instance = new CardCompany();
	private CardCompany() {
		 
	}
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}	return instance;
	}
	public Card createCard() {
		Card card = new Card(serialNum);
		return card;
	}
	
}
		

