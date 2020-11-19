package lesson8.Test8_3_2.Q2;

import java.util.Scanner;

class PurchasingException extends Exception{
	public PurchasingException(String message) {
		super(message);
	}
}

public class Purchasing {
	
	static int each=130;
	
	public static void weight(int eggs) throws PurchasingException {
		if(eggs>1500) {
			throw new PurchasingException("不能買這麼多");
		}else {
			double count=((double)eggs/500)*each;
			System.out.println("一共"+count+"元");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("模擬雞蛋的購買，每500公克130元，超過1500公克會拋出錯誤");
		
		System.out.print("請輸入購買公克數:");
		Scanner input=new Scanner(System.in);
		int eggs=input.nextInt();
		
		try {
			weight(eggs);
		} catch (PurchasingException e) {
			e.printStackTrace();
		}
	}

}
