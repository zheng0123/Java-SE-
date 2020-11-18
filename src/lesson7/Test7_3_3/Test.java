package lesson7.Test7_3_3;

public class Test {

	public static void main(String[] args) {
		Animal rabbit=new Rabbit();
		Rabbit r_rabbit=(Rabbit)rabbit;
		r_rabbit.eat();
		
		Animal bird=new Bird();
		Bird b_bird=(Bird)bird;
		b_bird.eat();
	}
}
