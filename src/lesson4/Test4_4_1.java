package lesson4;

public class Test4_4_1 {

	public static void main(String[] args) {
		System.out.println("Q1:將陣列的行、列互換");
		int [][] array= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		System.out.println("Q2:使用二維陣列做出楊輝三角形");
		int num[][]=new int[10][10],i,j;
		for(i=0;i<num.length;i++){
			num[i]=new int[i+1];
			for(j=0;j<=i;j++){
				if(i==0||i==j||j==0){
					num[i][j]=1;
				}else{
					num[i][j]=num[i-1][j]+num[i-1][j-1];
				}
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
