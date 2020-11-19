package lesson8.Test8_3_1;

import java.util.Scanner;

public class Arithmetic {
	
	static int digital1=0;
	
	public static void except(int digital2) throws ArithmeticException{
		int result=digital2/digital1;
	}
	
	public static void main(String[] args) {
		System.out.println("除數為0");
		
		Scanner input=new Scanner(System.in);
		System.out.print("請輸入數字:");
		int digital2=input.nextInt();
		
		try {
			except(digital2);
		} catch (ArithmeticException e) {
			System.out.println("除數不能是0");
		}
	}

}
