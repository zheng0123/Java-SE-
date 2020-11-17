package lesson5;

import java.util.Scanner;

public class Test5_5 {

	public static void main(String[] args) {
		System.out.println("分開執行沒問題，一起執行會出錯");
		
		System.out.println("Q1:將資料連在一起");
		StringBuffer day=new StringBuffer("日期: ");
		day.append("2020年11月17");
		System.out.println(day);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Q2:根據用戶實際情況修改用戶性別");
		String gender[]= {"男","女"};
		System.out.println("性別: "+gender[0]);
		System.out.println("===條件修改===");
		System.out.println("1 確認 ;  2 修改");
		
		Scanner input=new Scanner(System.in);
		System.out.print("請選擇:");
		int select = input.nextInt();
		
		if(select==1) {
			System.out.println("性別: "+gender[0]);
		}else {
			System.out.println("性別: "+gender[1]);
		}
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Q3:將新員工加進員工名單第一位");
		
		StringBuffer num=new StringBuffer("張三,李四,王五,趙六");
		String newNum="周七,";
		System.out.println(num.insert(0, newNum));
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Q4:留言不能超過10字");
		
		System.out.print("請留言:");
		String message=input.nextLine();
		StringBuffer message2=new StringBuffer(message);
		
		message2.delete(10, message2.length()); //第10個以後的字符都刪掉
		System.out.println(message2);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Q5:將用戶輸入的手機號碼屏蔽中間3碼");
		
		System.out.print("請輸入手機:");
		String photo=input.nextLine();
		StringBuffer photo2=new StringBuffer(photo);
		
		System.out.println("更改後:"+photo2.replace(3, 7, "***"));
		
	}

}
