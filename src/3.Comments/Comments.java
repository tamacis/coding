/*
	The compiler ignores comments so you can place them almost anywhere.
	This multiline comment is above the class declartion
*/
// A simple single line comment
class Comments {
	// The main method
	public static void main(String args[]) {
		/* 
			System.out.println("This will not display");
			System.out.println("Neither will this");
		*/
		System.out.pr/* comment */intln("Will this work?"); // No it won't
		System.out.println("Do not nest comments inside of an expression statement");
		
	}
}