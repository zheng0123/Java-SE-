package lesson8.Test8_2_1.Q2;

import java.util.Scanner;

public class PlusLessMultiplyExcept {
		
	double value=0;
		
	public void count(double a,double b,String symbol) {
		if(symbol.equals("+")) {
			value=a+b;
		}else if(symbol.equals("-")){
			value=a-b;
		}else if(symbol.equals("*")){
			value=a*b;
		}else if(symbol.equals("/")){
			value=a/b;
		}
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("請輸入2個數字:");
		double a = 0;
		double b = 0;
		try {
			a = input.nextDouble();
			b = input.nextDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.print("請輸入+或-或*或/:");
		String symbol=input.next();
		
		PlusLessMultiplyExcept plme=new PlusLessMultiplyExcept();
		plme.count(a,b,symbol);
	}
}
