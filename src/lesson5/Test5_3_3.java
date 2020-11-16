package lesson5;

import java.util.Scanner;

public class Test5_3_3 {

	public static void main(String[] args) {
		System.out.println("Q1:以www、.com來判斷是否為有效網址");
		Scanner input=new Scanner(System.in);
		System.out.print("請輸入網址:");
		String internet=input.next();
		
		String www = "www";
		String com = ".com";
		
		if(internet.contains(www) && internet.contains(com)) {
			System.out.println("輸入正確");
		}else {
			System.out.println("格式錯誤");
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Q2:找出手機號碼含有123的所有手機號碼");
		String phone[]= {"0912123655","0987676542","0913456123","0988776543","0912321766"};
		String check123="123";
		
		for(int i=0;i<5;i++) {
			if(phone[i].contains(check123)) {
				System.out.println(phone[i]);
			}
		}
		
		
	}
	
}
