package lesson9.Test9_3.Q2;

import java.util.Random;

public class Invoice {

	public static void main(String[] args) {
		System.out.println("模擬發票對獎");
		
		double money1000w=13362795;
		double money200w=27580166;
		
		Random random=new Random();
		double my=random.nextInt(99999999);
		
		
		if(my==money1000w) {
			System.out.println("獎金1000萬");
		}else if(my==money200w) {
			System.out.println("獎金200萬");
		}else {
			System.out.println("沒中獎");
		}
		
		
		
	}

}
