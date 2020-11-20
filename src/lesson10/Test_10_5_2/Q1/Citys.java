package lesson10.Test_10_5_2.Q1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Citys {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("台北市","大安區 萬華區 中正區 松山區");
		map.put("高雄市","小港區 楠梓區 岡山區");
		map.put("台中市","東區 西屯區");
		
		Iterator<String> citys=map.keySet().iterator();
		Iterator<String> areas=map.values().iterator();

		while(citys.hasNext()) {
			System.out.println(citys.next()+":"+areas.next());
		}
	}

}
