package lesson6.Test6_2_2;

public class Book {

	public static void main(String[] args) {
		System.out.println("買2本書可以打5折:");
		
		Book book=new Book();
		int java=300;
		int sql=600;
		System.out.println("打折前:"+book.count(java, sql)+"元");
		System.out.println("打折後:"+book.discount(java, sql)+"元");
	}
	
	public  int count(int i,int j) {
		int price=i+j;
		return price;
	}
	
	public  int discount(int i,int j) {
		int price=(int) ((i+j)*0.5);
		return price;
	}
	
}
