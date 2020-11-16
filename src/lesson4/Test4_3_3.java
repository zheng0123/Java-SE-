package lesson4;

public class Test4_3_3 {

	public static void main(String[] args) {
		System.out.println("Q1:int a[][]={{23,65,43,68},{45,99,86,80},{76,81,34,45},{88,64,48,25}}，算出兩對角線和");
		int a[][]={{23,65,43,68},{45,99,86,80},{76,81,34,45},{88,64,48,25}};
		int count1=0;
		int count2=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) { 
				if(i==j) {
//					System.out.println("1:"+a[i][j]);
					count1=count1+a[i][j];
				}
				if(i+j==3) {
//					System.out.println("2:"+a[i][j]);
					count2=count2+a[i][j];
				}
			}
		}
		System.out.println("對角線1:"+count1+",對角線2:"+count2);
		System.out.println("兩對角線和:"+(count1+count2));
		
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("Q2:一個3*3的空格，從1到9放入，使每行、每列、對角線相加皆相等");
//		int b[][]=new int[3][3];
//		int sum;
		
		
	}

}
