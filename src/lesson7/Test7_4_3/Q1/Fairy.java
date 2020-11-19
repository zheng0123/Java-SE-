package lesson7.Test7_4_3.Q1;

public class Fairy implements Sing,Fly{

	@Override
	public void canDo() {
		System.out.println("sing a song and fly");
	}

	@Override
	public void wing() {
		System.out.println("擁有翅膀");
	}

	@Override
	public void song() {
		System.out.println("唱首歌");
	}

}
