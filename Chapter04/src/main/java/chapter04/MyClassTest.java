package chapter04;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		try {
			mc.danger();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
