package lesson2;

public class Test2_5_6 {

	public static void main(String[] args) {
		System.out.println("Q1:a為int型別20，試輸出a>>32、a>>33、a>>1");
		int a =20,b=32,c=33,d=1;
		System.out.println("a>>32="+(a>>b));
		System.out.println("a>>33="+(a>>c));
		System.out.println("a>>1="+(a>>d));
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Q2:x為long型別150063000079L，試輸出x>>64、x>>65、x>>1");
		long x=150063000079L;
		System.out.println("x>>64="+(x>>64));
		System.out.println("x>>65="+(x>>65));
		System.out.println("x>>1 ="+(x>>1));
	}

}
