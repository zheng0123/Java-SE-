package lesson6.Test6_2_5;

public class Panda {
	
	String height;
	String weight;
	
	public Panda() {
		this("1.3","90");
	}
	
	public Panda(String height,String weight) {
		System.out.println("身高:"+height+"m 體重:"+weight+"kg");
	}

	public static void main(String[] args) {
		System.out.println("一隻熊貓高1.3m，重90kg，用this輸出熊貓相關資訊");
		Panda panda1=new Panda();
		Panda panda2=new Panda("1.24","59");
	}

}
