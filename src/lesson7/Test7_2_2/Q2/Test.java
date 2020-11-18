package lesson7.Test7_2_2.Q2;

public class Test {
	
	public static void main(String[] args) {
		Train train=new Train();
		System.out.println("火車:"+train.speed(30));
		
		HighTrain highTrain=new HighTrain();
		System.out.println("高鐵:"+highTrain.speed(30));
	}
}
