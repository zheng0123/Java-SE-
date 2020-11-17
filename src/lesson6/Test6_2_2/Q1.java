package lesson6.Test6_2_2;

public class Q1 {

	public static void main(String[] args) {
		System.out.println("橘子一斤50元，試問6斤橘子多少錢?");
		Q1 orange=new Q1();
		int price=50;
		int count=6;
		System.out.println("一共:"+orange.multiplication(price, count)+"元");
	}
	
	public int multiplication(int price,int count) {
		price=price*count;
		return price;
	}
}
