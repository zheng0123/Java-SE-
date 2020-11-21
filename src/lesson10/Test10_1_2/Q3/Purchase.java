package lesson10.Test10_1_2.Q3;

public class Purchase<T> {
	
	private T[] goods;
	
	public Purchase(T[] goods) {
		this.goods=goods;
	}
	
	public void insertGoods() {
		for(T str:goods)
		System.out.print(str+"\t");
	}
	
	public static void main(String[] args) {
		
		String goods[]= {"iphone9","黑色","19999"};
		Purchase<String> good=new Purchase<>(goods);
		
		System.out.println("商品名稱\t商品顏色\t商品價格");
		good.insertGoods();
	}
}
