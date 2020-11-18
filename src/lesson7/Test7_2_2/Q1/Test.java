package lesson7.Test7_2_2.Q1;

public class Test {
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		System.out.println("交通工具"+vehicle.move());
		
		Train train=new Train();
		System.out.println("火車"+train.move());
		
		Car car=new Car();
		System.out.println("汽車"+car.move());
	}
}
