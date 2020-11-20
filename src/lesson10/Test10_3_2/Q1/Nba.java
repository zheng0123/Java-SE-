package lesson10.Test10_3_2.Q1;

import java.util.ArrayList;
import java.util.List;

public class Nba {

	public static void main(String[] args) {
		List<String> nba=new ArrayList<>();
		nba.add("喬丹,飛人,30.1,6.2,5.3");
		nba.add("柯比,黑曼巴,25.1,5.3,4.7");
		nba.add("博德,大鳥,24.3,10,6.3");
		nba.add(0,"鄧肯,石佛,20.7,11.4,3.2");
		
		System.out.println("球員名稱\t綽號\t得分\t籃板\t助攻");
		
		for(int i=0;i<nba.size();i++) {
			String[] tokens = nba.get(i).split(",");
			for(String token:tokens) {
				System.out.print(token+"\t");
			}
			System.out.println();
		}
	}

}
