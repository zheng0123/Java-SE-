package lesson7.Test7_2_3.Q3;

public class Check {
	
	public static void main(String[] args) {
		System.out.println("改寫equals方法，使豬會等於狗");
		
		Pig pig =new Pig();
		Dog dog =new Dog();
		if(pig.equals(dog)) {
			System.out.println("豬=狗");
		}
	}
}

class Pig{
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

class Dog{
	
}
