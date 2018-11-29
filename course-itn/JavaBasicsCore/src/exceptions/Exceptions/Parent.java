package section7.exceptions;

public class Parent {
	void showMessage() {
		System.out.println("parent");
	}
	
	void displayMessage() throws ArithmeticException{
		System.out.println("parent");
	}
	
	void sayHello() throws Exception{
		System.out.println("parent hello");
	}
	
	void sayHi() throws Exception{
		System.out.println("parent hi");
	}
}
