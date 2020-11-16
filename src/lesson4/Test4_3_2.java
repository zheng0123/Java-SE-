package lesson4;

public class Test4_3_2 {

	public static void main(String[] args) {
		System.out.println("Q1:一書櫃有3層2列，在(1,1)放入歷史，(2,1)放入經濟，(2,2)放入化學");
		String bookCase[][]=new String[3][2];
		bookCase[0][0]="歷史";
		bookCase[1]=new String[] {"經濟","化學"};
		for(String[] books:bookCase) {
			for(String book:books) {
				System.out.println(book);
			}
		}
		
		System.out.println("Q2:103有80人、104有91人、105有85人，印出總人數");
		int class103[][]=new int[10][8];
		int class104[][]=new int[10][10];
		int i;
		for(i=1;i<=9;i++) {
			class104[1][i]=1;
		}
		int class105[][]=new int[10][9];
		for(i=1;i<=5;i++) {
			class105[1][i]=1;
		}
		int class103Is0=0;
		for(int j[]:class103) {
			for(int k:j) {
				if(k==0) {
					class103Is0=class103Is0+1;
				}
			}
		}
		int class104Is0=0;
		for(int l[]:class104) {
			for(int m:l) {
				if(m==0) {
					class104Is0=class104Is0+1;
				}
			}
		}
		int class105Is0=0;
		for(int n[]:class105) {
			for(int o:n) {
				if(o==0) {
					class105Is0=class105Is0+1;
				}
			}
		}
		int count=class103Is0+class104Is0+class105Is0;
		System.out.println("總人數:"+count+"人");
		
	}

}
