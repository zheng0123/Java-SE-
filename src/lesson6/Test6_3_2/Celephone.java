package lesson6.Test6_3_2;

public class Celephone {
	
	static void callTo() {
		for(int i=0;i<6;i++) {
			System.out.println("都......");
		}
		System.out.println("此電話無人接聽");
	}
	
	public static void main(String[] args) {
		
		System.out.println("模擬手機撥不通的情況");
		
		System.out.println("正在撥打電話.....");
		
		Celephone.callTo();
	}

}
