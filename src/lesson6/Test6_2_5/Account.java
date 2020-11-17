package lesson6.Test6_2_5;

import java.util.Scanner;

public class Account {
	
	String myAcc;
	String password;
	
	public Account(String myAcc){
		this(myAcc,"12345");
	}
	
	public Account(String myAcc,String password){
		this.myAcc=myAcc;
		this.password=password;
		
		System.out.println("輸入帳號:"+myAcc+" 輸入帳號:"+password);
	}

	public static void main(String[] args) {
		System.out.println("帳戶有帳號跟密碼，密碼預設為12345，也可以自行設置");
		 
		Account a1=new Account("amy198765");
		Account a2=new Account("amy198765","happy");
	}

}
