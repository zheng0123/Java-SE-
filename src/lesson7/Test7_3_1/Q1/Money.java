package lesson7.Test7_3_1.Q1;

public class Money {
	
	public void pay(int price) {
		System.out.println(price+"元，用現金支付");
	}
	
	public void pay(int price,String card) {
		System.out.println(price+"元，用"+card+"支付");
	}
	
	public static void main(String[] args) {
		Money money=new Money();
		money.pay(100);
		money.pay(100,"熊大卡");
	}

}
