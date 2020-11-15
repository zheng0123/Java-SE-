package lesson3;

public class Test3_4_1 {

	public static void main(String[] args) {
		System.out.println("Q1:捷運有18站，一乘客從起始站搭到第4站，請輸出搭過的站");
		System.out.print("乘客搭過");
		for(int x=1;x<=18;x++) {
			System.out.print(x+" ");
			if(x==4) {
				break;
			}
		}
		System.out.println("站");
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Q2:一井口10m，一隻蝸牛從井底往上爬，白天爬2m，晚上往下滑1m，問幾天出井口");
		int up=2;
		int down=1;
		int num=0;
		int i;
		for(i=1;i<111;i++) {
			num=num+up;
			if(num==10) {
				break;
			}
			num=num-down;
		}
		System.out.println(i+"天可爬出井");
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Q3:一個8*8的陣列，編寫一程式使其到第2排第5列時停止");
		int h1,v1;
		Loop:for(h1=1;h1<=8;h1++) {
			for(v1=1;v1<=8;v1++) {
				if(h1==2 && v1==5) {
					System.out.println("第"+h1+"排,第"+v1+"列");
					break Loop;
				}
			}
		}
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Q4:一停車場有4排，一排10個，讓車主到第3排第6個");
		int h2,v2;
		Loop:for(h2=1;h2<=4;h2++) {
			for(v2=1;v2<=10;v2++) {
				if(h2==3 && v2==6) {
					System.out.println("第"+h2+"排,第"+v2+"個");
					break Loop;
				}
			}
		}
		
	}

}
