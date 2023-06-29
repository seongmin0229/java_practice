package chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		// deprecated : 조만간 없어질거다 쓰지마라
		Integer i = new Integer(10);
		
		// Auto Boxing : 자동으로 객체 생성해줌
		Integer i2 = 10;
		Long l = 10L;
		
		System.out.println(i2.equals(10));	// 여기도 Auto Boxing
		
		System.out.println(i2 == 10);	// 이건 Auto Boxing이 아님, 이건 i2를 Auto Unboxing해서 상수로 비교한 것.
//		System.out.println(i2.intValue() == 10);
		
		int m = i2 + 10;	// 여기도 Auto UnBoxing
//		int m = i2.intValue() + 10;
		
	}

}
