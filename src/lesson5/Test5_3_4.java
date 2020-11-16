package lesson5;

import java.util.Scanner;

public class Test5_3_4 {

	public static void main(String[] args) {
		System.out.println("Q1:圖片有6張圖片 abc.jpg d.gif ef.png hijk.jpg lmn.gif opq.jpg ");
		System.out.println("根據輸入的序號，印出檔案名");
		System.out.println("1-.jpg  2-.gif  3-.png");
		
		String photo[]= {"abc.jpg","d.gif","ef.png","hijk.jpg","lmn.gif","opq.jpg",};
		String input1=".jpg";
		String input2=".gif";
		String input3=".png";
		
		Scanner input=new Scanner(System.in);
		System.out.print("輸入數字:");
		int num=input.nextInt();
		for(int i=0;i<photo.length;i++) {
			if(num==1) {
				if(photo[i].endsWith(input1)) {
					System.out.println(photo[i]);
				}
				
			}else if(num==2) {
				if(photo[i].endsWith(input2)) {
					System.out.println(photo[i]);
				}
			}else if(num==3){
				if(photo[i].endsWith(input3)) {
					System.out.println(photo[i]);
				}
			}else {
				System.out.println("查無此數字");
			}
		}
	}

}
