package lesson3;

import java.util.Scanner;

public class Test3_3_5 {

	public static void main(String[] args) {
		System.out.println("Q1:5元可以買一隻公雞，3元可以買一隻母雞，1元可以買三隻小雞，100元買100隻雞，可以分別買幾隻?");
		int a, b, c;  
		for (a = 0; a <= 20; a++) {
			for (b = 0; b <= 33; b++) {
				c = 100 - a - b;
				if (a * 5 + b * 3 + c / 3 == 100 && c % 3 == 0) {
					System.out.println("a:"+a);
					System.out.println("b:"+b);
					System.out.println("c:"+c);
				}
			}
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Q2:根據用戶輸入的*數量，畫出對應行數的等腰三角形");
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入:");
		String count=input.next();
		int x;
		for(x=1;x<=count.length();x++) {
			for(int y = (count.length()-1); y >= x; y--) { 
                System.out.print(" "); 
            }
			for(int z = 0; z < x; z++) {    
                System.out.print("* ");
            }
			System.out.print("\n");
		}

	}

}
