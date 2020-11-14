package lesson2.test;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Q1:將37攝氏度轉換為整數華氏度");
		int c=37;
		int f=(int) (32+1.8*c);
		System.out.println("37度C="+f+"度F");
		
		System.out.println("-------------------------");
		
		System.out.println("Q2:一圓柱體，直徑10公尺，高3公尺，體積?一立方米可屯糧750公斤，該糧倉可存?");
		int a=10;
		int h=3;
		final  float PI=3.14F;
		int v=(int) (a*a/4*PI*h);
		System.out.println("體積:"+v+"立方公尺");
		int food=v*750;
		System.out.println("可存糧食:"+food+"公斤/立方公尺");
	}

}
