package lesson7.Test7_3_4;

public class Bird {

	public static void main(String[] args) {

		Chicken chicken=new Chicken();
		System.out.println((chicken instanceof Bird));
	}

}

 class Chicken extends Bird {
}
