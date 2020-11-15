package lesson3;

import java.util.Scanner;

public class Test3_3_1 {

	public static void main(String[] args) {
		System.out.println("Q1:在1~1000猜一數字，目標數字147");
		Scanner input = new Scanner(System.in);
		
		int bingo=147;
		
		while(true) {
			System.out.print("請輸入:");
			int guess=input.nextInt();
			if(guess<1 || guess>1000) {
				System.out.println("超過範圍，再猜一個");
			}else if(guess>bingo) {
				System.out.println("太大啦!，再猜一個");
			}else if(guess<bingo) {
				System.out.println("太小啦!，再猜一個");
			}else {
				System.out.println("bingooooooo!!!");
				break;
			}
		}
		
		System.out.println("----------------------------------------");
		
		System.out.println("Q2:細胞分裂可以1分裂成2，試算出第10代有幾個細胞");
		int cell=2;
		int ans=0;
		int x=0;
		
		for(int conut=0;conut<10;conut++) {
			ans=(int)Math.pow(cell, conut);
//			System.out.println("ans"+ans); 
			x=x+ans;
		}
		System.out.println("一共有:"+x+"個細胞");
		
	}
}
