package lesson7.Test7_4_2.Q2;

public class Test {

	public static void main(String[] args) {
		System.out.println("上課囉~~~");
		
		Teacher teacher=new Teacher();
		Student student=new Student();
		
		teacher.sayHi();
		student.sayHi();
		
		teacher.onClass();
		student.onClass();
	}

}
