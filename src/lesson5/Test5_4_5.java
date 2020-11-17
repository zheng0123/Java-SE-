package lesson5;

import java.util.Scanner;

public class Test5_4_5 {

	public static void main(String[] args) {
		System.out.println("Q1:模擬用戶輸入帳號(忽略空格)");
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入帳號:");
		String id=input.next();
		String idNew=id.trim();  //去除前後空格
		System.out.println(idNew);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Q2:去除代碼中所有空白");
		System.out.print("請輸入:");
		String code=input.nextLine();  
		String codeNew=code.replaceAll(" ", "");  //去除代碼中所有空格
		System.out.println(codeNew);
	}

}
