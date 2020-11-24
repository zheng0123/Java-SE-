package lesson9.Test9_2_2.Q3;

import java.util.Scanner;

public class Vegeterbae {
	
	public void price(int tomorrow,int today) {
		System.out.println("浮動值:"+Math.abs(tomorrow-today));
	}
	
	public static void main(String[] args) {
		System.out.println("輸入2值，算出蔬菜的浮動值");
		
		Scanner input=new Scanner(System.in);
		System.out.print("請輸入昨日價格:");
		int tomorrow=input.nextInt();
		System.out.print("請輸入今日價格:");
		int today=input.nextInt();
		
		Vegeterbae v=new Vegeterbae();
		v.price(tomorrow, today);
	}

}
