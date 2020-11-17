package lesson5;

import java.util.Scanner;

public class Test5_4_4 {

	public static void main(String[] args) {
//		System.out.println("Q1:全轉小寫、大寫");
//		
//		String str="HAppy amY Is mE";
//		System.out.println("全轉大寫:"+str.toLowerCase());
//		System.out.println("全轉小寫:"+str.toUpperCase());
//		
//		System.out.println("-------------------------------------");
//		
//		System.out.println("Q2:用關鍵字搜尋(大小寫不分)");
		
		String bookcase[][]= {{"Java","Java Web","C#"},{"世說新語","聊齋誌異","格林童話"}};
		
		Scanner input = new Scanner(System.in);
		System.out.print("輸入關鍵字:");
		String book=input.next();
		
		for(int i=0;i<bookcase.length;i++) {
			for(int j=0;j<bookcase[0].length;j++) {
				if(bookcase[i][j].contains(book) || bookcase[i][j].toLowerCase().contains(book.toLowerCase()) ) {
					System.out.println(bookcase[i][j]);
				}
			}
		}
	}

}
