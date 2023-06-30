package chapter04;

public class ExceptionTest {
	public static void main(String args[]) {
		int a = 10;
		int b = 10 - a;
		
		System.out.println("some code1");
		
		try {
			System.out.println("some code2");
			
			int result = (1 + 2 + 3) / b;
			
			System.out.println("some code3");	
			System.out.println("some code4");		
		}catch(ArithmeticException e) {
			/* 예외처리 */
			// 99퍼센트의 예외의 경우 돌이킬 수 없는 경우가 대부분이다.
			// 그러므로 그냥 정상 종료 시키는게 답인 경우가 대부분이다.
			// 이럴 때 강호의 도리로 사과를 하고, 로깅을 해준다음 정상종료를 시킨다.
			
			// 1. 정중한 사과를 한다.
			System.out.println("미안하고..죄송하고..송구하며..유감이고..역지사지하고..");
			
			// 2. 로깅
			System.out.println("error : " + e);	// 이거나
			e.printStackTrace();	// 이거
			
			// 3. 정상적인 종료
			return;
		}finally{
			System.out.println("자원정리");
		}
		
		// 예외가 발생한 이후에 실행할 가능성이 있는 코드이기 때문에 매우 비추
		// System.out.println("some code5");		
	}
}
