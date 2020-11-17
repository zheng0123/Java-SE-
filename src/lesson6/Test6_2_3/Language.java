package lesson6.Test6_2_3;

public class Language {
	public Language(){
		System.out.println("手機默認語言為英文");
	}
	
	public Language(String str){
		System.out.println("手機默認語言變為"+str);
	}
	
	public static void main(String[] args) {
		System.out.println("手機默認語言為英文，使用建構方法修改默認語言為中文");
		Language language1=new Language();
		Language language2=new Language("中文");
	}

}