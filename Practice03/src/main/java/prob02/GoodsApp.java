package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		int count = 0;
		// 상품 입력
		while(scanner.hasNextLine()) {
			if(count >= COUNT_GOODS) {
				break;
			}
			goods[count] = new Goods();
			String inputStr[] = scanner.nextLine().split(" ");
			goods[count].setName(inputStr[0]);
			goods[count].setPrice(Integer.parseInt(inputStr[1]));
			goods[count].setCountStock(Integer.parseInt(inputStr[2]));
			count++;
		}
		// 상품 출
		for(int i = 0; i < goods.length; i++) {
			goods[i].showGoods();
		}
		// 자원정리
		scanner.close();
	}
}
