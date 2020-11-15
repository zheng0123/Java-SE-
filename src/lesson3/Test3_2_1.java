package lesson3;

import java.util.Scanner;

public class Test3_2_1 {

	public static void main(String[] args) {
		System.out.println("Q1:輸入大於90顯示優等、81~90顯示良好、61~80顯示及格、60以下顯示不及格");
		
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入成績:");
		int score=input.nextInt();
		
		if(score>90) {
			System.out.println("優等");
		}else if(score>=81 && score<=90) {
			System.out.println("良好");
		}else if(score>=61 && score<=80) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Q2:輸入身高(m)、體重(kg)後，算出bmi");
		System.out.print("清輸入身高 體重");
		float height=input.nextFloat();
		float weight=input.nextFloat();
		float bmi=weight/(height*height);
		
		System.out.println("bmi="+bmi);
		
		if(bmi<18.5) {
			System.out.println("偏輕");
		}else if(bmi<25 && bmi>=18.5) {
			System.out.println("正常");
		}else if(bmi<30 && bmi>=25) {
			System.out.println("偏重");
		}else {
			System.out.println("肥胖");
		}
		
	}

}
