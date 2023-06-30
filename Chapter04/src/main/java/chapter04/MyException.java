package chapter04;

public class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException() {
		super("MyException caused");
	}
	
	public MyException(String msg) {
		super(msg);
	}
	
}
