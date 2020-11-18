package lesson7.Test7_2_3.Q1;

public class Apple {
	
	String name="糖心富士";
	double price=300;
	
	void money(double weight) {
		double total=(weight/500)*price;
		System.out.println("一共"+total+"元");
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public static void main(String[] args) {
		Apple apple=new Apple();
		System.out.println(apple);
		apple.money(800);
	}
	
}