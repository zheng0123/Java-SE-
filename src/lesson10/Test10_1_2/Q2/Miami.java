package lesson10.Test10_1_2.Q2;

public class Miami<T>{
	
	private T name;
	private T winSum;
	private T winYears;
	
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getWinSum() {
		return winSum;
	}

	public void setWinSum(T winSum) {
		this.winSum = winSum;
	}

	public T getWinYears() {
		return winYears;
	}

	public void setWinYears(T winYears) {
		this.winYears = winYears;
	}

	public static void main(String[] args) {
		Miami<String> miami=new Miami();
		miami.setName("Miami");
		miami.setWinYears("1899,1999,1988");
		
		Miami<Integer> miami2=new Miami();
		miami2.setWinSum(3);
		
		System.out.println("奪冠次數為"+miami2.getWinSum()+"的隊伍");
		System.out.println("隊伍:"+miami.getName()+"\n奪冠年份:"+miami.getWinYears());
		
		Miami<String> detroit=new Detroit();
		System.out.println("隊伍:"+detroit.getName()+"\n奪冠年份:"+detroit.getWinYears());
		
		Miami<String> philadelphia=new Philadelphia();
		System.out.println("隊伍:"+philadelphia.getName()+"\n奪冠年份:"+philadelphia.getWinYears());
	}

}

class Detroit extends Miami<String>{
	
	@Override
	public String getName() {
		return "Detroit";
	}
	
	@Override
	public String getWinYears() {
		return "2018,1989,1962";
	}

}

class Philadelphia extends Miami<String>{
	
	@Override
	public String getName() {
		return "Philadelphia";
	}
	
	@Override
	public String getWinYears() {
		return "2020,1981,1970";
	}
	
	
}