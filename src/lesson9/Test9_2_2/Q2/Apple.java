package lesson9.Test9_2_2.Q2;

import java.util.Scanner;

public class Apple {
	
	public static void main(String[] args) {
		System.out.println("500g的蘋果60.7元，四捨五入");
		
		Scanner input=new Scanner(System.in);
		System.out.print("輸入蘋果g數:");
		double i=input.nextInt();
		
		System.out.println(Math.rint((i/500)*60.7)+"元");
	}

}
