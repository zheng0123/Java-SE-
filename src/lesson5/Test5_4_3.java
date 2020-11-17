package lesson5;

import java.util.Scanner;

public class Test5_4_3 {

	public static void main(String[] args) {
		System.out.println("Q1:把姓名跟綽號配對");
		String name="宋江,盧俊義,林沖,魯智深,武松";
		String nickname="及時雨,玉麒麟,豹子頭,花和尚,行者";
		String name2[]=name.split(",");
		String nickname2[]=nickname.split(",");
		
		for(int i=0;i<name2.length;i++) {
			System.out.println(name2[i]+":"+nickname2[i]);
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Q2:模擬火車訂票系統");
		
		String train[][]= {{"車次","出發站","終點站","出發時間","抵達時間"},
						   {"A12","台北","  高雄","   12:30"," 16:59"},
			   			   {"B99","宜蘭","  台東","   13:23"," 14:24"},
			   			   {"C87","台中","  苗栗","   15:12"," 15:30"}};
		
		for(int k=0;k<train.length;k++) {
			for(int l=0;l<train[0].length;l++) {
				System.out.print(train[k][l]+" ");
			}
			System.out.println();
		}
		
		Scanner input = new Scanner(System.in);	   				   
		System.out.print("請輸入車次:");
		String num=input.next();
		System.out.print("請輸入乘車人姓名:");
		String who=input.next();
		
		for(int m=0;m<train.length;m++) {
			if(num.equals(train[m][0])) {
				System.out.println("乘車人姓名:"+who+" "+train[0][0]+":"+train[m][0]);
				System.out.println(train[0][1]+":"+train[m][1]+"("+train[0][3]+":"+train[m][3]+")");
				System.out.println(train[0][2]+":"+train[m][2]+"("+train[0][4]+":"+train[m][4]+")");
			}
		}
	}

}
