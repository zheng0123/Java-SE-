package lesson7.Test7_5_3.Q1;

public final class Xmachine {
	
	String name="X光機";
	
	public void shine(String where) {
		System.out.println(where+"照"+name);
	}
	
	public static void main(String[] args) {
		Xmachine xmachine=new Xmachine();
		xmachine.shine("胸");
	}
}
