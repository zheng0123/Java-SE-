package lesson10.Test10_1_2.Q1;

public class Bank<T> {
	private T[] account;
	
	public Bank(T[] account) {
		this.account=account;
	}

	public T[] getAccount() {
		return account;
	}
	
	public void show() {
		System.out.println("銀行名稱\t使用者帳戶\t\t餘額\t幣別");
		for(int i=0;i<account.length;i++) {
			System.out.print(account[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		
		String amy[]= {"一間銀行","000123666","9965278","新台幣"};
		Bank<String> amyAccount=new Bank<>(amy);
		
		amyAccount.show();
	}
}
