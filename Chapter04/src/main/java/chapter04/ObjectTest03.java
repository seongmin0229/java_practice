package chapter04;

public class ObjectTest03 {
	public static void main(String args[]) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + " : " + s2.hashCode());
		System.out.println(System.identityHashCode(s1) + " : " + System.identityHashCode(s2));
		
		System.out.println("==================================");
		
		String s3 = "hello";
		String s4 = "hello";	
		
		System.out.println(s3 == s4);	// 위와 다르게 같은 객체라서 true를 반환한다.
										// JVM이 이러한 literal을 만나면 일단 상수풀(Constant Pool)에 저장을 하고, 
										// 이후에 해시값이 같은 리터럴을 새 객체에 저장하려고 할 때 같은 상수풀의 같은 리터럴의 레퍼런스를 가리키도록 한다.
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + " : " + s4.hashCode());
		System.out.println(System.identityHashCode(s3) + " : " + System.identityHashCode(s4));
		
	}
}