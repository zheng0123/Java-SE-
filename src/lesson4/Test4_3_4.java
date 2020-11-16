package lesson4;

public class Test4_3_4 {

	public static void main(String[] args) {
		System.out.println("Q1:公車有9排4列，1代表有票、0是無票，模擬售票過程");
		
		System.out.println("Q2:5位學生回答10題，輸出學生答案、答對題數");
		String ans[]=      {"B","A","D","C","C","B","C","A","D","D"};
		String student[][]= {{"A","A","D","B","C","B","A","A","D","D"},
							{"B","A","D","C","C","B","C","A","A","C"},
							{"B","A","A","A","C","B","C","C","A","D"}, 
							{"A","A","D","C","C","C","C","A","D","D"},
							{"B","A","C","C","A","B","B","A","A","A"}}; 
		
		for(int i=0;i<5;i++) {
			System.out.print("student"+(i+1)+":");
			int count=0;
			for(int j=0;j<10;j++) {
				System.out.print(student[i][j]+" ");
				if(ans[j]==student[i][j]) {
					count=count+1; //計算每個學生答對題數
				}
			}
			System.out.println("答對題數:"+count);
		}
		
	}

}
