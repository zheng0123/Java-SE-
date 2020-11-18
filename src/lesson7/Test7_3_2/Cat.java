package lesson7.Test7_3_2;

public class Cat extends Animal{
	
	String name="貓咪";
	
	public void talk() {
		System.out.print(name);
		super.talk();
		System.out.println("喵喵喵");
	}
}
