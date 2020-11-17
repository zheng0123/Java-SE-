package lesson6.Test6_2_5;

public class Teacher {
	
	String name="小林老師";
	String gender="女";
	String age="35";
	
	public static void main(String[] args) {
		System.out.println("老師有姓名、性別、年齡，用this為他們賦值");
		Teacher teacher1=new Teacher();
		Teacher teacher2=new Teacher("倩茜","女","21");
	}
	
	public Teacher() {
		this("小林老師","女","35");
	}
	
	public Teacher(String name,String gender,String age) {
		System.out.println("姓名:"+name+" 性別:"+gender+" 年齡:"+age);
	}
}
