package lesson7.Test7_4_1.Q1;

public abstract class Shape {
	
	int length=4;
	public abstract void area();
		
}

class Circle extends Shape{

	@Override
	public void area() {
		int a=length*length;
		System.out.println(a);
	}
}

class Rectangle extends Shape{
	
	final double PI=3.14159;
	
	@Override
	public void area() {
		double a=PI*length*length;
		System.out.println(a);
	}
}