package lesson9.Test9_2_2.Q4;

public class Origin {
	
	public double check(double x,double y) {
		return Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
	}
	
	public static void main(String[] args) {
		System.out.println("A(3.8,4.2) B(3.2,4.5)判斷哪個離原點近");
		
		double x1=3.8;
		double x2=4.2;
		double y1=3.2;
		double y2=4.5;
		
		Origin a=new Origin();
		double aa=a.check(x1, y1);
		Origin b=new Origin();
		double bb=b.check(x2, y2);
		
		if(aa>bb) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
	}

}
