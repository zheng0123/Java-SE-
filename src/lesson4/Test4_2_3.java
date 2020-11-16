package lesson4;

public class Test4_2_3 {

	public static void main(String[] args) {
		System.out.println("Q1:把鍵盤上的字母見存成陣列，分別輸出三排字母的長度");
		String a[]= {"Q","W","E","R","T","Y","U","I","O","P"};
		String b[]= {"A","S","D","F","G","H","J","K","L"};
		String c[]= {"Z","X","C","V","B","N","M"};
		
		System.out.println("第一排:"+a.length);
		System.out.println("第二排:"+b.length);
		System.out.println("第三排:"+c.length);
		
		System.out.println("--------------------------------------------------");
		System.out.println("Q2:有20個箱子，第2、3、5、8、12、13、16、19、20尚未使用，輸出使用與未使用的數量");
		int box[]=new int[20];
		box[1]=2;
		box[2]=3;
		box[4]=5;
		box[7]=8;
		box[11]=12;
		box[12]=13;
		box[15]=16;
		box[18]=19;
		box[19]=20;
		
		int i;
		int conut=0;
		for(i=0;i<box.length;i++) {
			if(box[i]!=0) {
				conut++;
			}
		}
		System.out.println("已使用:"+(box.length-conut)+"個");
		System.out.println("未使用:"+conut+"個");
	}

}
