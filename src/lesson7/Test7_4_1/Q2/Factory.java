package lesson7.Test7_4_1.Q2;

public abstract class Factory {
	public abstract void produce();
}

class CarFactory extends Factory{

	@Override
	public void produce() {
		System.out.println("生產車子");
	}
}

class ShoesFactory extends Factory{

	@Override
	public void produce() {
		System.out.println("生產鞋子");
	}
}