package lesson8.Test8_3_2.Q1;

import java.util.Scanner;

class ClassException extends Exception{
	public ClassException(String message) {
		super(message);
	}
}

public class RollCall {
	
	public static void call(String name1) throws ClassException {
		if(name1.equals("zoe")) {
			throw new ClassException("翹課???");
		}else {
			System.out.println(name1+"到");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("模擬老師上課點名");
		
		Scanner input=new Scanner(System.in);
		System.out.print("點名啦:");
		String name=input.next();

		try {
			call(name);
		} catch (ClassException e) {
			e.printStackTrace();
		}
	}

}
