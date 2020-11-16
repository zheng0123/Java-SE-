package lesson5;

public class Test5_3_5 {

	public static void main(String[] args) {
		System.out.println("Q1:將 今天天氣真好 轉置輸出");
		String str="今天天氣真好";
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}

}
