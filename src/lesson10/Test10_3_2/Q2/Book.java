package lesson10.Test10_3_2.Q2;

import java.util.ArrayList;
import java.util.List;

public class Book {

	public static void main(String[] args) {
		List<String> bookcase1=new ArrayList<>();
		List<String> bookcase2=new ArrayList<>();
		
		bookcase1.add("西遊記");
		bookcase1.add("水滸傳");
		System.out.println("bookcase1:"+bookcase1);
		
		bookcase2.add("三國演義");
		bookcase2.add("羅密歐與茱麗葉");
		bookcase2.add("紅樓夢");
		System.out.println("bookcase2:"+bookcase2);
		
		System.out.print("中國四大名著:");
		bookcase2.set(1,bookcase1.get(1));
		bookcase2.add(0,bookcase1.get(0));
		
		for(String bookcase:bookcase2) {
			System.out.print(bookcase+" ");
		}
	}
	
}
