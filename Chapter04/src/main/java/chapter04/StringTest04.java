package chapter04;

public class StringTest04 {
	public static void main(String args[]) {
		String s = "Hello" + " World" + " Java" + " 17";	// java는 연산자 오버로드가 안되는데 어떻게 했을까

		String s1 = new StringBuffer("Hello")
				.append(" World ")
				.append("Java ")
				.append(17)	// 자기 자신을 반환하기 때문에 chain method를 쓸 수 있음	
				.toString();

		System.out.println(s1);
		System.out.println(s1);
		// 위랑 아래랑 똑같음
		
		// +연산자가 유용하긴 하지만 쓰면 안되는 경우가 있음.
//		String s2 = "";
//		for(int i = 0; i < 100000; i++) {
//			s2 += i;
////			s2 = new StringBuffer(s2).append(i).toString();
//		}
		
		// 굉장히 오래걸림 (일반 + 연산과는 다르게 메모리 접근 횟수가 어어어어엄청 많아서)
		// 그래서 이럴땐 그냥 버퍼 쓰는게 좋음
		StringBuffer sb = new StringBuffer("");
		for(int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		String s2 = sb.toString();
		System.out.println(s2.length());
		
		
	}
}
