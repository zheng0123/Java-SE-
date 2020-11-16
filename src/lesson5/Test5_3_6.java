package lesson5;

import java.util.Scanner;

public class Test5_3_6 {

	public static void main(String[] args) {
		System.out.println("Q1:模擬員工打卡情況");
		String en= "員工名單:趙錢,孫李,李妍,佳佳,小花,妙妙,林林";
		Scanner input=new Scanner(System.in);
		System.out.print("輸入員工姓名:");
		String name=input.next();
		
		boolean request=en.contains(name); 
		System.out.println(name+"是否是員工?"+request);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Q2:根據關鍵字找出書名");
		String book[]= {"從0開始學java","程式好好玩","java從入門到放棄"};
		
		System.out.print("輸入:");
		String select=input.next();
		
		for(int m=0;m<book.length;m++) {
			boolean check=book[m].contains(select);
			if(check) {
				System.out.println(book[m]);
			}
		}
		
	}

}
