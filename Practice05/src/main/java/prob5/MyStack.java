package prob5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private int top;
	private List<String> dataArray;
	
	public MyStack(int size) {
		top = -1;
		dataArray = new ArrayList<>(3);
	}
	
	public void push(String str) {
		top++;
		dataArray.add(str);
	}
	
	public String pop() throws MyStackException{
		if(top == -1)
			throw new MyStackException();
		String str =  dataArray.get(top);
		top--;
		return str;
	}
	
	public boolean isEmpty() {
		return (top == -1 ? true : false);
	}
}