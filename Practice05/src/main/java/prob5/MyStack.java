package prob5;

public class MyStack {
	private int top;
	private String[] stack;
	private int originStackLen;
	
	public MyStack(int size) {
		top = -1;
		stack = new String[size];
		originStackLen = size;
	}
	
	public void push(String str) {
		top++;
		if(top > stack.length - 1) {
			String tempArray[] = new String[top + 1];
			for(int i = 0; i < stack.length; i++) {
				tempArray[i] = stack[i];
			}
			stack = tempArray;
			System.out.println("이전 완료!" + stack.toString());
		}
		stack[top] = str;
	}
	
	public String pop() throws MyStackException{
		if(top == -1)
			throw new MyStackException();
		String str =  stack[top];
		if(stack.length > originStackLen) {
			String[] tempArray = new String[top];
			for(int i = 0; i < tempArray.length; i++) {
				tempArray[i] = stack[i];
			}
			stack = tempArray;
		}
		top--;
		return str;
	}
	
	public boolean isEmpty() {
		return (top == -1 ? true : false);
	}
}