package lesson7.Test7_2_1.Q1;

public class Test {
	public static void main(String[] args) {
		System.out.println("創建銀行卡類，銀行卡有2個子類:金融卡、信用卡");
		
		CreditCard creditCard=new CreditCard();
		creditCard.pay(20);
		
		BankCard bankcard=new BankCard();
		System.out.println(bankcard.card);
		
		DebitCard debitcard=new DebitCard();
		debitcard.save(500);
	}
}
