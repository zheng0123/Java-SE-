package lesson6.Test6_3_1;

import java.util.Scanner;

public class Taxi {
	
	static int start = 100;  //起步價
	double baseDistance=2.5;
	int baseMoney=20;  //超過2.5km後，每km的價格
	
	public void countMoney(double distance) {
		if(distance<=baseDistance) {
			System.out.println("乘客應付:"+start+"元");
		}else {
			int money=(int) ((distance-baseDistance)*baseMoney+start);
			System.out.println("乘客應付:"+money+"元");
		}
	}
	
	public void changeStart(int startNew){
		start=startNew;  //把新的起步價賦值給舊起步價
	}
	
	public static void main(String[] args) {
		System.out.println("計程車起步價為2.5km 100元，超過2.5km，每km增加20元");
		
		Scanner input =new Scanner(System.in);
		System.out.print("請輸入本次行駛里程:");
		double distance=input.nextDouble();
		
		Taxi price=new Taxi();
		price.countMoney(distance);
		
		System.out.print("價格變更啦!請輸入新起步價:");
		int startNew=input.nextInt();
		Taxi newStart=new Taxi();
		newStart.changeStart(startNew);
		
		System.out.print("請輸入本次行駛里程:");
		double distanceNew=input.nextDouble();
		
		Taxi priceNew=new Taxi();
		priceNew.countMoney(distanceNew);
	}

}
