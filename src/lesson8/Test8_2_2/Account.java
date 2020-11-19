package lesson8.Test8_2_2;

import java.util.Scanner;

public class Account {

	int balance=93481;
		
	public void getMoney(int money) {
		if(balance>=money) {
			System.out.println("取款:"+money+"元，餘額:"+(balance-money)+"元");
		}else {
			System.out.println("超過餘額");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("模擬取款");
		
		System.out.print("請輸入要取款金額:");
		Scanner input=new Scanner(System.in);
		int cash=0;
		try {
			cash = input.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("輸入金額格式錯誤");
		}
		
		Account amy=new Account();
		amy.getMoney(cash);
	}

}
