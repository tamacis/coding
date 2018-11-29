package section7.exceptions;

import java.io.IOException;

public class ChildExceptionTest extends Parent {
//	 1) Rule: If the superclass method does not declare an exception,
//	 subclass overridden method cannot declare the checked exception.

//	 void showMessage() throws IOException {
//	 System.out.println("child");
//	 }

	// 2) Rule: If the superclass method does not declare an exception,
	// subclass overridden method cannot declare the checked exception
	// but can declare unchecked exception.
	void showMessage() throws ArithmeticException {
		System.out.println("child");
	}

	// 3) Rule: If the superclass method declares an exception,
	// subclass overridden method can declare same,
	// subclass exception or no exception but cannot declare parent exception.

	// 3a)subclass overridden method declares parent exception
	// void displayMessage() throws Exception{
	// System.out.println("child");
	// }

	// 3b)subclass overridden method declares same exception
	void sayHello() throws Exception {
		System.out.println("child hello");
	}

	// 3c)subclass overridden method declares subclass exception
	void sayHi() throws ArithmeticException {
		System.out.println("parent hi");
	}

	public static void main(String[] args) {
		Parent parent = new ChildExceptionTest();
		parent.showMessage();
		try {
			parent.sayHello();
			parent.sayHi();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
