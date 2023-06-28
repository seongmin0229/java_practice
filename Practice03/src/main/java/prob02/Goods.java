package prob02;

public class Goods {
	private String name;		// 모든 접근이 가능하다. 
	private int price;	// 같은 패키지 + 자식접근*
	private int countStock;			// 디폴트, 같은 패키지
	private int countSold;	// 클래스 내부에서만 가능
	
	public void m() {
		setCountSold(0);
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	
	public void showGoods() {
		System.out.println(name + "(가격 : " + price + "원)이 " + countStock + "개 입고 되었습니다.");
	}
}
