package lesson7.Test7_6_1;

public class Classroom {
	
	class Teacher{
		
		final int MAX=10;
		
		public void count(int howMuch) {
			if(howMuch>MAX) {
				System.out.println("老師人數不可超過10，超過"+(howMuch-MAX)+"人");
			}else {
				System.out.println("老師有"+howMuch+"人");
			}
		}
	}
	
	class Student{
		
		final int MAX=60;
		
		public void count(int howMuch) {
			if(howMuch>MAX) {
				System.out.println("學生人數不可超過60，超過"+(howMuch-MAX)+"人");
			}else {
				System.out.println("學生有"+howMuch+"人");
			}
		}
	}
	
	public static void main(String[] args) {
		Classroom class101=new Classroom();
		Classroom.Teacher teacher1=class101.new Teacher();
		Classroom.Student student1=class101.new Student();
		System.out.println("class101:");
		teacher1.count(6);
		student1.count(20);
		
		Classroom class102=new Classroom();
		Classroom.Teacher teacher2=class102.new Teacher();
		Classroom.Student student2=class102.new Student();
		System.out.println("class102:");
		teacher2.count(13);
		student2.count(68);
	}
	
}
