package lesson5;

import java.util.Scanner;

public class Test5_4_6 {

	public static void main(String[] args) {
		System.out.println("Q1:判斷帳號是否可以用");
		String ids[]= {"happy123","amy97qq","hellopeggy"};
		
		Scanner input=new Scanner(System.in);
		System.out.print("請輸入帳號:");
		String id=input.nextLine();
		
		for(int i=0;i<ids.length;i++) {
			if(id.equals(ids[i])) {
				System.out.println("此帳號已被註冊，不可用");
			}
		}
		
		System.out.println("---------------------------------");
		System.out.println("Q2:實現帳號、密碼登入功能");
		
		String members[][]= {{"a","b"},{"b103","addbbb"},{"b104","pppass"},{"b105","new33"}};
		
		System.out.print("請輸入帳號:");
		String acc=input.nextLine();
		System.out.print("請輸入密碼:");
		String password=input.nextLine();
		
		for(int m=0;m<members.length;m++) {
			for(int n=0;n<members[m].length;n++) {
				if(acc.equals(members[m][n])) {
					System.out.println("帳號正確");
				}
				if(password.equals(members[m][n])) {
					System.out.println("密碼正確");
				}
			}
		}
	}

}
