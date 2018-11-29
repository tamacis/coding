package section7.exceptions;

//The Java throw keyword is used to explicitly throw an exception.
//We can throw either checked or uncheked exception in java by throw keyword.
//The throw keyword is mainly used to throw custom exception.
public class ThrowTest {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		validate(19);
		System.out.println("rest of the code...");
	}
}
