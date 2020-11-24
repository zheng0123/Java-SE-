package lesson9.Test9_1_1;

public class CompareTo {

	public static void main(String[] args) {
		System.out.println("判斷MAX_VALUE+1與MIN_VALUE是否相等");
		
		int i=Integer.MAX_VALUE+1;
		Integer newI=Integer.valueOf(i);
		int j=Integer.MIN_VALUE;
		Integer newJ = Integer.valueOf(j);
		
		if(newI.compareTo(newJ)==0) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
	}

}
