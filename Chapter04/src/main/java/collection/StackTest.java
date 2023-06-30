package collection;

import java.util.List;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("hello");
		stack.push("world");
		stack.push("!!!");
		stack.push("java");
		stack.push(".");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("===========");
		
		stack.push("Hello");
		System.out.println(stack.pop());
		
		//비어있는 경우, pop을 호출하면 예외가 발생함.
		//stack.pop();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우너");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());	// 얘는 데이터를 보기만 함.
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
