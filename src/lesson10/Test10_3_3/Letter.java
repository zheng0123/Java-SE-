package lesson10.Test10_3_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Letter {
	
	public static void main(String[] args) {
		
		char letter1[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
			'T', 'U', 'V', 'W', 'X', 'Y', 'Z' }; 
		System.out.print("陣    列:");
		Collection<Character> letter2=new ArrayList<>();
		for(int i=0;i<letter1.length;i++) {
			System.out.print(letter1[i]+" ");
			letter2.add(letter1[i]);
		}
		
		System.out.print("\n迭代器:");
		Iterator<Character> letter3=letter2.iterator();
		while(letter3.hasNext()) {
			char letter4=letter3.next();
			System.out.print(letter4+" ");
		}
	}
}
