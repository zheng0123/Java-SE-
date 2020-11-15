package lesson3;

public class Test3_4_2 {

	public static void main(String[] args) {
		System.out.println("Q1:影廳有4行，一行10個座位，屏蔽掉最左與最右列");
		int x,y;
		for(x=1;x<=4;x++) {
			for(y=1;y<=10;y++) {
				if(y!=1 && y!=10) {
					System.out.print("("+x+","+y+")");
					continue;
				}
				System.out.println();
			}
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("Q2:一個4*5的座位表，除了(1,3)跟(3,2)，其他都是空的，輸出空的座位");
		int a,b;
		for(a=1;a<=4;a++) {
			for(b=1;b<=4;b++) {
				if((a!=1 && b!=3) || (a!=3 && b!=2)) {
					System.out.print("("+a+","+b+")");
					continue;
				}
			}
			System.out.println();
		}
	}

}
