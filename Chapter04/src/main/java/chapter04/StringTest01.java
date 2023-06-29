package chapter04;

public class StringTest01 {

	public static void main(String[] args) {
		// c:\temp을 출력하고 싶다
		System.out.println("c:\\temp");	// UNIX기반의 OS들은 directory표시를 할 때 \를 씀, 근데 표준은 /
										// 표준으로 써 놓으면 윈도우 JVM에서 알아서 \로 변환해줌. (그냥 강사님의 팁)
										// \t는 서식 문자로 탭임. 이거 어떻게 출력할건데 -> \하나 더 추가해주기
		
		// "hello"를 출력하고 싶다
		System.out.println("\"hello\"");
		
		// '를 출력하고 싶다
		System.out.println("\'");
		
		// \t : tab
		// \r : carrige return
		// \n : new line
		// \b : beep sound
	}

}
