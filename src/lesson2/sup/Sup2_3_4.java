package lesson2.sup;

import java.util.Scanner;

public class Sup2_3_4 {
	public static void main(String[] args) {
		System.out.println("Q1:身高超過1.2m需購票，試判斷身高為1m與1.5m的小朋友坐火車時是否該購票");
		int h1=1;
		float h2=1.5f,hh=1.2f;
		boolean result1=(h1>hh);
		boolean result2=(h2>hh);
		System.out.println("1m小朋友要買票嗎?"+result1);
		System.out.println("1m小朋友要買票嗎?"+result2);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Q2:月薪超過40000元要繳稅，請讓用戶輸入月薪，並判斷是否該繳稅");
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入月薪:");
		int taxation=40000;
		int salary=sc.nextInt();
		boolean result3=salary>taxation;
		System.out.println("用戶輸入:"+salary);
		System.out.println("要繳稅嗎?"+result3);
	}
}
