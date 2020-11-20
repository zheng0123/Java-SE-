package lesson10.Test_10_5_2.Q2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Star {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("請輸入5個評審的打分:");
		int p1=input.nextInt();
		int p2=input.nextInt();
		int p3=input.nextInt();
		int p4=input.nextInt();
		int p5=input.nextInt();
		
		Map<String,Integer> map=new HashMap<>();
		map.put("小鼠",p1);
		map.put("Amy",p2);
		map.put("小華",p3);
		map.put("小林",p4);
		map.put("zoe",p5);
		
		Iterator<String> m =map.keySet().iterator();
		Iterator<Integer> coi=map.values().iterator();
		
		System.out.println("評審名\t給分");
		System.out.println("------------");
		
		int count=0;
		while(m.hasNext()) {
			String str=m.next();
			int val=coi.next();
			System.out.println(str+"\t"+val);
			count=count+val;
		}
		
		System.out.println("------------");
		System.out.println("總分\t"+count);
	}

}
