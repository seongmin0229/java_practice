package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	// collection 프레임워크, 자료구조는 객체의 레퍼런스가 아닌 객체의 내용(데이터)을 중요시 한다는 것을 머리에 새기자.
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		String s1 = new String("둘리");
		String s2 = new String("둘리");
		
		s.add("둘리");
		s.add("마이콜");
		s.add("또치");
		s.add(s2);
		
		System.out.println(s.size());
		System.out.println(s.contains(s1));
		
		// 삭제
		s.remove("마이콜");
		
		// 순회
		for(String str : s) {
			System.out.println(str);
		}
	}

}
