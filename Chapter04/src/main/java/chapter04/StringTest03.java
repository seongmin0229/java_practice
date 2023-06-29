package chapter04;

public class StringTest03 {
	public static void main(String args[]) {
		String s1 = "aBcABCabcAbc";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.indexOf("abc", 7));	// fail : return -1
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 5)); // 3, 4
		
		String s2 = "   ab    cd   ";
		String s3 = "efg,hij,klm,nop,qrs";
		
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		System.out.println("====" + s2.trim() + "====");	// trim은 양 옆 공백 짤라주는 함수

		System.out.println("====" + s2.replaceAll(" ", "") + "====");
		
		String[] tokens = s3.split(",");
		
		for(String token : tokens) {
			System.out.println(token);
		}
		
		String[] tokens2 = s3.split(" ");	//이럴 땐 그냥 문자열 통째로 배열 맨 앞에다 넣어줌.
		
		for(String token : tokens2) {
			System.out.println(token);
		}
		
		
	}
}
