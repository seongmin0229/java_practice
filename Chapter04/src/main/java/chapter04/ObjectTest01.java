package chapter04;

public class ObjectTest01 {
	public static void main(String args[]) {
		Point p = new Point(10, 20);
		
		// Class klass = p.getClass();
		System.out.println(p.getClass());	// reflection
		
		System.out.println(p.hashCode());	// address (x), 
											// reference (x)
											// address기반의 해싱값
		
		System.out.println(p.toString());	// getClass() + "@" + hashCode()
											// 대체적으로 overriding 후에 디버깅 용으로 많이 씀
		
		System.out.println(p);
	}
}