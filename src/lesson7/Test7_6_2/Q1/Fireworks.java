package lesson7.Test7_6_2.Q1;

abstract class Cast{
		abstract void boom();
	}

public class Fireworks {
	
	public static void main(String[] args) {
		System.out.println("匿名內部類");
		
		new Cast() {

			@Override
			void boom() {
				System.out.println("煙火爆炸啦!");
			}
			
		}.boom();
	}
}
