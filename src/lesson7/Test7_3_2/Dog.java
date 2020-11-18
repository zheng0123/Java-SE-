package lesson7.Test7_3_2;

public class Dog extends Animal{
	
	String name="小狗狗";
	
	public void talk() {
		System.out.print(name);
		super.talk();
		System.out.println("旺旺旺");
	}
}
