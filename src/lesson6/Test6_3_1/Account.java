package lesson6.Test6_3_1;

import java.util.Scanner;

public class Account {
	static double rate = 0.0265;
	
	public void calculateInterest(int principal, int years) {
		double var = 1;
		for (int i = 1; i <= years; i++) {
			var *= (1 + rate);
		}
		double interests = principal * var - principal;
		System.out.println(years + "年后，存入" + principal + "元所获利息为" + String.format("%.3f", interests) + "元RMB。");
	}

	public void changeRate(double newrate) {
		rate = newrate/100;
	}
	
	public static void main(String[] args) {
		int principal;
		int years;
		Scanner sc = new Scanner(System.in);
		System.out.println("当前银行死期年利率为" + (rate * 100) + "%。\n请输入存款本金：");
		principal = sc.nextInt();
		System.out.println("请输入存款年限：");
		years = sc.nextInt();
		Account oldAccount = new Account();
		oldAccount.calculateInterest(principal, years);
		System.out.println("利率变了！请输入调整后的存款利率（利率格式:2.65）：");
		double changedrate = sc.nextDouble();
		Account newAccount = new Account();
		newAccount.changeRate(changedrate);
		System.out.println("请输入存款本金：");
		principal = sc.nextInt();
		System.out.println("请输入存款年限：");
		years = sc.nextInt();
		newAccount.calculateInterest(principal, years);
		sc.close();
	}
}

