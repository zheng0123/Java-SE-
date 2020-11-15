package lesson2;

import java.util.Scanner;

public class Test2_5_5 {

	public static void main(String[] args) {
		System.out.println("Q:網站有三個登入方式:帳號、手機、信箱，試判斷此用戶是否輸入正確");
		System.out.println("(帳號:happy0123;手機:0912345678;信箱:happy0123@345.com)");
		
		String a="happy0 123";
		String b="0912345678";
		String c="happy0123@345.com";
		
		System.out.print("請輸入:");
		Scanner input = new Scanner(System.in);
		String str=input.next();
		
		boolean result=((str==a)||(str==b)||(str==c));
		
		System.out.println("用戶輸入:"+str);
		System.out.println("是否正確:"+result);
	}

}
