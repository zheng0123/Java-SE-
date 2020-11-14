package lesson2.sup;

public class Sup2_4_2 {

	public static void main(String[] args) {
		System.out.println("Q1:將65強制轉換成char");
		int a=65;
		char c=(char)a;
		System.out.println(c);
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Q2:載貨區長2m，寬4m，1個箱子長寬皆1.5m，試問一區能放多少箱子?");
		int h1=2,v1=4;
		float h2v2=1.5f;
		int ans=(int)((float)(h1*v1)/(h2v2*h2v2));
		System.out.println("可放置"+ans+"個箱子");
	}

}
