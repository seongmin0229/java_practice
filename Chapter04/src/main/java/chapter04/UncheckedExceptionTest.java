package chapter04;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		// Unchecked Exception은 try catch 없이 발생해야한다.
		// 왜? 예외를 보고 수정해야하는 예외라기보다는 로직 에러에 가깝기 때문이다.
		// 지금 하는 예시와 같이 로직상의 오류로 인해 생기는 예외같은 경우에는 예외처리를 하는 것이 아니다.
		// 코드 읽기만 힘들어진다. 로지컬 오류는 그냥 터지면 고쳐라
		// ex ) ArrayIndexOutOfBoundException
		//		ArithmeticException
		//		NullPointException
		
//		try {
			for(int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}			
//		} catch(ArrayIndexOutOfBoundsException e){
//			e.printStackTrace();
//		}
	}
}