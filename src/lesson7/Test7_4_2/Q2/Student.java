package lesson7.Test7_4_2.Q2;

public class Student implements Classroom{
	
	String name="同學";
	
	@Override
	public void sayHi() {
		System.out.println(name+":老師好!");
	}

	@Override
	public void onClass() {
		System.out.println(name+":做筆記做筆記...");
	}

}
