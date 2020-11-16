package lesson5;

import java.util.Scanner;

public class Test5_4_1 {

	public static void main(String[] args) {
		System.out.println("Q1:任意截取手機後3碼和後4碼");
		
		Scanner input=new Scanner(System.in);
//		System.out.print("輸入手機號碼:");
//		String num=input.next();
//		
//		String n3=num.substring(7,10);
//		String n4=num.substring(6,10);
//		
//		System.out.println("後三碼:"+n3);
//		System.out.println("後四碼:"+n4);
//		
		System.out.println("------------------------------------");
		
		System.out.println("Q2:輸入信箱，並截取帳號部分");
		System.out.print("請輸入信箱:");
		String mail=input.next();
		
		if(mail.contains("@")) {
			for(int j=0;j<mail.indexOf("@");j++) {  //@的索引位置
				System.out.print(mail.charAt(j));
			}
		}else {
			System.out.println("格式錯誤");
		}
	}

}
