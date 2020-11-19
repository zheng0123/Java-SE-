package lesson7.Test7_5_3.Q3;

class Train {
	
	final int PEOPLE=108; 
	final int EACH=10;
	
	void sum(int howMuch){
		if(howMuch>PEOPLE*EACH) {
			System.out.println("超載啦!!!多了"+(howMuch-PEOPLE*EACH)+"人");
		}else {
			System.out.println("本車共載"+howMuch+"人");
		}
	}
}

public class Test{
	public static void main(String[] args) {
		Train train=new Train();
		System.out.println("一列火車可載運乘客"+train.PEOPLE*train.EACH+"人");
		train.sum(1000);
		train.sum(2000);
	}
}