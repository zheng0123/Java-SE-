package lesson8.Test8_2_1.Q1;

public class Exception {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
	
		for(int i=0;i<a.length;i++) {
			try {
				System.out.println(a[i]);
				int k=i/0;
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}
	}
}
