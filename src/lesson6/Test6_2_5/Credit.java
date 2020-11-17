package lesson6.Test6_2_5;

public class Credit {
	String cardNum;
	String password;
	
	public Credit(String cardNum, String password) {
		this.cardNum = cardNum;
		this.password = password;
		if (password.equals("123456")) {
			System.out.println("信用卡" + cardNum + "的默认密码为" + password);
		} else {
			System.out.println("重置信用卡" + cardNum + "的密码为" + password);
		}
	}
	
	public Credit(String cardNum) {
		this(cardNum, "123456");
	}
	
	public static void main(String[] args) {
		Credit initialCredit = new Credit("4013735633800642");
		Credit resetedCredit = new Credit("4013735633800642", "168779");
	}
}