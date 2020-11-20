package lesson10.Test10_4_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Books {
	
	private String book;
	private String name;
	private int price;
	
	public Books(String book, String name, int price) {
		super();
		this.book = book;
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return book+"\t"+name+"\t"+price+"元\n";
	}
	
	public static void main(String[] args) {
		
		System.out.println("購物車中有以下商品");
		
		Books book1=new Books("Java入門","陳大明",670);
		Books book2=new Books("Java中級","王筱方",390);
		Books book3=new Books("Java高級","林依依",1560);
		
		Set set=new HashSet();
		set.add(book1);
		set.add(book2);
		set.add(book3);
		
		System.out.println("-------------------------");
		System.out.println("品名\t作者\t價格");
		System.out.println("-------------------------");
		
		Iterator book=set.iterator();
		
		while(book.hasNext()) {
			System.out.print(book.next());
		}
		
		System.out.println("-------------------------");
		
		int money=(int) (book1.getPrice()+book2.getPrice()+book3.getPrice());
		System.out.println("合計:\t\t"+money+"元");
	}
	
}
