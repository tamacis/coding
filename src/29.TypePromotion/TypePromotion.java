// Type Promotion.

// Even though we know the result of the arithmetic expressions will fit just
// fine into a data type, the rules of automatic type converions won't
// let that happen without type casting
// In order to solve the problem Java created a new set of rules for type promotion. 

// * The expression must be contained inside a pair of opening and closing 
//   parenthesis.
// * If any of the operands are type double then the result is promoted to double.
// * Otherwise, if any of the operands are type float, then the result is promoted to float.
// * Otherwise, if any of the operands are type long, then the result is promoted to long.
// * Otherwise, if any or all of the operands are type byte, short, char, or int then 
//   the result is promoted to int.


class TypePromotion {
	public static void main(String args[]) {
		byte b = 2;
		//b = b * b; // error, the result of  b * b was promoted to an int data type
		//b = (byte) b * b; // still an error, the expression b * b needs to be in parenthesis
		b = (byte) (b * b);
		System.out.println("b = " + b);

		short s = 130;
		char c = 'A';
		s = (short) (s / c);
		System.out.println("s = " + s);

		float f = 2.25F;
		int i = 5;
		f = (float) (f + i);
		System.out.println("f = " + f);

		s = 130;
		long L = 125;
		s = (short) (s % L);
		System.out.println("s = " + s);

		i = 25;
		double d = 12.5D;
		i = (int) (i - d); // remember, casting can result in data loss
		System.out.println("i = " + i);
	}
}