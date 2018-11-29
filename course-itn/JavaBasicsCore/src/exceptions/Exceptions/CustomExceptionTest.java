

public class CustomExceptionTest {
	static void validate(int age) throws InvalidEmployeeException {
		if (age < 18 || age>60)
			throw new InvalidEmployeeException("not valid");
		else
			System.out.println("welcome to company");
	}

	public static void main(String args[]) {
		try {
			validate(13);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("rest of the code...");
	}
}
