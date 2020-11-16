package lesson5;

public class Test5_1_2 {

	public static void main(String[] args) {
		System.out.println("Q1:輸出柯比:你有見過凌晨4點的洛杉磯嗎?");
		
		char talk[]= {'柯','比',':','你','有','見','過','凌','晨','4','點','的','洛','杉','磯','嗎','?',};
		System.out.print(talk);
		System.out.println();
		
		String str1="柯比:";
		String str2="你有見過凌晨4點的洛杉磯嗎?";
		String str=str1+str2;
		System.out.println(str);
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Q2:用程式做出指定對話");
		String teacher="老師:";
		String student="同學:";
		char talk1[]= {'我','愛','我','家'} ;
		
		System.out.println(teacher+"一個字一個字讀");
		System.out.println(student+talk1[0]);
		System.out.println(student+talk1[1]);
		System.out.println(student+talk1[2]);
		System.out.println(student+talk1[3]);
		System.out.println(teacher+"兩個字兩個字讀");
		System.out.println(student+talk1[0]+talk1[1]);
		System.out.println(student+talk1[2]+talk1[3]);
		System.out.println(teacher+"整句讀出來");
		System.out.print(student);
		System.out.println(talk1);
	}

}
