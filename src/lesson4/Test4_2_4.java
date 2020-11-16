package lesson4;

import java.util.Scanner;

public class Test4_2_4 {

	public static void main(String[] args) {
		System.out.println("Q1:一學生成績為59、90、45、78、20，印出其及格的分數");
		int a[]= {59,90,45,78,20};
		int i;
		for(i=0;i<a.length;i++) {
			if(a[i]>=60) {
				System.out.println(a[i]);
			}
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("Q2:用戶輸入三門考試成績，輸出其總成績");
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入成績:");
		String score1=input.next();
		String score2=input.next();
		String score3=input.next();
		String grade[]= {score1,score2,score3};
		int count=0;
		for(String n:grade) {
			System.out.println("輸入的成績:"+n+"分");
			count=count+Integer.valueOf(n);
		}
		System.out.println("總成績:"+count+"分");
	}

}
