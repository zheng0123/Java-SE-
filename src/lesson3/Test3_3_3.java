package lesson3;

public class Test3_3_3 {

	public static void main(String[] args) {
		System.out.println("Q1:有一組數 1、1、2、3、5、8、13、21、34，試用for迴圈算出第n個數");
//		int n=100;
//		int y=0;
//		for(int x=1;x<=n;x++) {
//			y=n;
//			
//		}
//		System.out.println(y);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Q2:一個球從80m處掉下，每次落地後高度是本來的一半，試算出第6次落地共經過多少m、反彈高度");
		
		double h= 80; //高度
		double d = 80; //距離
		
		for(int i=0;i<5;i++) {
			d=d+h; 
			h=h/2;
		}
		System.out.println("高度為" + d+"m");
		System.out.println("距離為" + h+"m");
	}

}
