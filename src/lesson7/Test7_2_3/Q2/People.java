package lesson7.Test7_2_3.Q2;

public class People {
	
	int age;
	String level;
	
	void check(int age) {
		this.age=age;
	}
	
	@Override
	public String toString() {
		if(age>=18) {
			level="成年人";
		}else {
			level="未成年";
		}
		return level;
	}
	
	public static void main(String[] args) {
		System.out.println("判斷是否為成年人");
		
		People people=new People();
		people.check(6);
		System.out.println("我"+people.age+"歲，"+people.toString());
	}
}
