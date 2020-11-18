package lesson7.Test7_2_1.Q2;

public class Test {

	public static void main(String[] args) {
		System.out.println("使用繼承說明人工包裝跟一般包裝的差別");
		
		Packaged packaged=new Packaged();
		packaged.setName("包裝apple");
		packaged.setPrice(45);
		packaged.setWeight(3.5f);
		
		Artificial artificial=new Artificial();
		artificial.setName("精裝apple");
		artificial.setPrice(70);
		artificial.setWeight(3.5f);
		artificial.setArtificialFee(((float)artificial.getPrice() - (float)packaged.getPrice()));
		
		System.out.println("水果名稱\t水果價格(元/kg)\t水果重量(kg)\t包裝費(元/kg)\t總價"); 
		System.out.println("——————————————————————————————————————————————————————————————"); 
		System.out.println(packaged.getName() + "\t" + packaged.getPrice() + "\t" + packaged.getWeight() + "\t" 
						   + "\t" + "0.0" + "\t\t" +  packaged.getPrice() * packaged.getWeight());
		System.out.println(artificial.getName() + "\t" + artificial.getPrice() + "\t" + artificial.getWeight()
		                   + "\t\t" + artificial.getArtificialFee() + "\t\t"
				           +  artificial.getPrice() * artificial.getWeight()); 
		System.out.println("——————————————————————————————————————————————————————————————"); 
		System.out.println("差价\t\t\t\t\t\t\t"
				           + (artificial.getPrice() * artificial.getWeight() - packaged.getPrice() * packaged.getWeight())); 
	}
}


