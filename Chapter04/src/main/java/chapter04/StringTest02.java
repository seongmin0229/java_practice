package chapter04;

public class StringTest02 {
	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();	// "abc"의 값을 가진 String 객체의 내용이 바뀐것이 아닌, toUpperCase로 새로운 객체를 생성하고,
								// s1의 레퍼런스가 그 새로 생긴 객체로 바뀐것임.
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@");	// 이 코드가 내부적으로 어떻게 동작할 지 생각해보자.
												// !이 먼저 생성되고, concat의 매개변수인 s2와 결합된 새로운 객체 생성, !는 레퍼런스가 0이라 사라짐
												// 그러면 !ABC가 생성이 된 후 바로 concat으로 @가 생성되어 또 합쳐진 객체가 생성되고 그것을 s5가 레퍼런싱
												// !ABC와 @는 레퍼런스 값이 0이되어 사라짐.
		System.out.println(s1);					
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		String s6 = "Hello";
		System.out.println(equalsHello(s6));
	}
	public static boolean equalsHello(String s) {
//		return s.equals("Hello"); 이 방법보다는
		return "Hello".equals(s);	//이게 안전함(null pointer exeption을 피하기 위해
	}
}
	