package lesson4;

import java.util.Arrays;

public class Test4_4_2 {

	public static void main(String[] args) {
		System.out.println("Q1:10箱雞蛋，一箱可裝60個，因機器故障每箱少2個");
		int box1[][]=new int[10][60];
		int j,k;
		for(int i=0;i<10;i++) {
			for(j=0;j<2;j++) {
				box1[i][j]=1; //把每一行的頭2個變成1
				System.out.print(box1[i][j]+" "); //印出每一行頭2個
			}
			for(k=0;k<58;k++) {
				System.out.print(box1[i][j]+" "); //印出第3~60個
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Q1:10箱雞蛋，一箱可裝60個，因機器故障後面6箱都少2個");
		int box2[][]=new int[10][60];
		int b,c;
		
		for(int a=0;a<10;a++) {
			if(a>=4) {
				for(b=0;b<2;b++) {
					box2[a][b]=1; //把頭2個變成1
					System.out.print(box2[a][b]+" "); //印出每一行頭2個
				}
			}else {
				for(b=0;b<2;b++) {
					box2[a][b]=0; //把頭2個變成0
					System.out.print(box2[a][b]+" "); //印出每一行頭2個
				}
			}
			for(k=0;k<58;k++) {
				System.out.print(box1[a][b]+" "); //印出第3~60個
			}
			System.out.println();
		}

	}

}
