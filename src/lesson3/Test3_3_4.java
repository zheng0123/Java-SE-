package lesson3;

public class Test3_3_4 {

	public static void main(String[] args) {
		System.out.println("Q1:遍歷{{'牙膏','1','65'},{'口香糖','6','28'},{'奶茶','100','10'}}");
		System.out.println("分別是品名、數量、價格");
		
		String info[][]= {{"牙膏","1","65"},{"口香糖","6","28"},{"奶茶","100","10"}};
		
		for(String[] x:info) {
			for(String y:x) {
				System.out.println(y);
			}
		}
		
	}

}
