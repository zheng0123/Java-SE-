package lesson6.Test6_2_5;

public class Battery {
	
	int bCount=0;
	double v=1.5;
	
	public Battery(){
		this(1);
	}
	
	public Battery(int bCount){
		this.bCount=bCount;
		double bV=bCount*v;
		System.out.println( bCount + "顆電池，電壓為" + bV + "V。");
	}
	
	public static void main(String[] args) {
		System.out.println("一顆5號電池有1.5V，試算出9V需要幾顆");
		Battery battery1=new Battery();
		Battery battery2=new Battery(6);
	}

}
