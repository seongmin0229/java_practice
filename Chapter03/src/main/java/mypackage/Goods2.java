package mypackage;

public class Goods2 {
	public String name;		// 모든 접근이 가능하다. 
	protected int price;	// 같은 패키지 + 자식접근*
	int countStock;			// 디폴트, 같은 패키지
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
}