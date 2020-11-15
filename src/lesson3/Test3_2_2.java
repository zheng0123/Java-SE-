package lesson3;

import java.util.Scanner;

public class Test3_2_2 {

	public static void main(String[] args) {
		System.out.println("Q1:使用控制台輸出使用者輸入的月份是什麼季節");
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入月份:");
		int season=input.nextInt();
		switch(season) {
		case 1:
		case 2:
		case 3:
			System.out.println("Spring");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Summer");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Autumn");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("Winter");
			break;
		}

	}

}
