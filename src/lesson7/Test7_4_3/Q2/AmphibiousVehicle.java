package lesson7.Test7_4_3.Q2;

public class AmphibiousVehicle implements Land{
	
	String name="水陸兩棲車";
	
	@Override
	public void inWater() {
		System.out.println(name+"行駛在水中");
	}

	@Override
	public void inLand() {
		System.out.println(name+"行駛在陸地上");
	}

}
