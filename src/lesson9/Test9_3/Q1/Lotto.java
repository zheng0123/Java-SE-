package lesson9.Test9_3.Q1;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		System.out.println("隨機產生1~35間的5個數字(不重複)");
		
		int nums[] = new int[5];
		
		Random random=new Random();
		
		for(int i=0;i<5;i++) {
			nums[i]=(int)(random.nextInt(35))+1;
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j] && j != 0) {
					j--;
					break;
				}
			}
		}
		for(int k:nums) {
			System.out.print(k+" ");
		}
		
	}

}
