/* 
------------------------------------------------
Arithmetic Operators Type Promotion

byte, short, char are promoted to int
int is promoted to long if there is a long operand
float is promoted to double if there is a double operand

Comment out the codes to see compile time errors

------------------------------------------------
 
------------------------------------------------
Method Overloading Type Promotion
byte is promoted to short
short is promoted to int
char is promoted to int
int is promoted to long
float is promoted to double
------------------------------------------------
*/

class TypePromotion {
	static public void main (String[] args) {
	
	byte b1 = 5, b2 = 6;
	short s1 = 7, s2 = 3;
	char c1 = 65 ,c2 = 1;
 	int i1 = 10;
	long l1 = 20L;
	float f1 = 2.0f;
	double d1 = 4.0;
	
/*************************************************
	byte, short, char errors out at compile type 
	with the following error
	TypePromotion.java: error: unexpected type
		required: reference
		found:    int
**************************************************/
	// System.out.println( (b1 + b2) instanceof Byte); 
	// System.out.println( (s1 - s2) instanceof Short);
	// System.out.println( (c1 * c2) instanceof Character);

/*************************************************
	int errors out at compile type 
	with the following error
	TypePromotion.java: error: unexpected type
		required: reference
		found:    long
**************************************************/
	// System.out.println( (l1 / i1) instanceof Int);

/*************************************************
	float errors out at compile type 
	with the following error
	TypePromotion.java: error: unexpected type
		required: reference
		found:    double
**************************************************/
	// System.out.println( (d1 % f1) instanceof Float);

	
	System.out.print("byte: ");
	(new Numerics()).calcS(b1, b2);
	
	System.out.print("short: ");
	(new Numerics()).calcI(s1, s2);

	System.out.print("char: ");
	(new Numerics()).calcI(c1,c2);

	System.out.print("int: ");
	(new Numerics()).calcL(i1, i1);

	System.out.print("float: ");
	(new Numerics()).calcD(f1, f1);
	}
}

class Numerics {
	void calcS(short a, short b) {
	System.out.println("promoted to short");
	}
	void calcS(int a, int b) {
	System.out.println("promoted to int");
	}

	void calcI(int a, int b) {
	System.out.println("promoted to int");
	}

	void calcL(long a, long b) {
	System.out.println("promoted to long");
	}

	void calcD(double a, double b) {
	System.out.println("promoted to double");
	}

}