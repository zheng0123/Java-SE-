package lesson7.Test7_3_1.Q2;

public class Car {
	
	public void wheel() {
		System.out.println("車子都有輪子");
	}
	
	public void wheel(int count) {
		System.out.println("車子都有"+count+"個輪子");
	}
	
	public static void main(String[] args) {
		Car car=new Car();
		car.wheel();
		car.wheel(10);
	}

}
