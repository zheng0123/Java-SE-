package lesson7.Test7_4_2.Q2;

public class Teacher implements Classroom{
	
	String name="老師";
	
	@Override
	public void sayHi() {
		System.out.println(name+":同學們，大家好!");
	}

	@Override
	public void onClass() {
		System.out.println(name+":開始上課啦!");
	}

}