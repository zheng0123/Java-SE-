package lesson6.Test6_2_3;

public class Cola {
	
	public Cola() {
		System.out.println("一杯可樂，冰塊正常!");
	}
	
	public Cola(int n) {
		System.out.println("一杯可樂，冰塊"+n+"顆!");
	}
	
	public static void main(String[] args) {
		System.out.println("來買可樂喔~~");
		Cola cola1=new Cola();
		Cola cola2=new Cola(2);
	}

}
