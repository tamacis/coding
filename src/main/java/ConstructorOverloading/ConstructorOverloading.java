/*
--------------------------------------------------------
Overloading 1:
Same name,  but different number of parameters, types any
    ctor(int)    ctor(int, int)    ctor(int, float)

Overloading 2:
Same name, same number of parameter, but different types:
    ctor(int)    ctor(float)    
--------------------------------------------------------
*/

class Box {
	Box() {
		super();
	}
	
	Box (int a) {
	}

	Box (int a, int b) {
	}
	
	Box (int a, float b) {
	}

}

class Ball {
	Ball() {
		super();
	}

	Ball (int a) {
	}

	Ball (float b) {
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Box b1 = new Box(1);
		Box b2 = new Box(1, 3);
		Box b3 = new Box(1, 2.0f);

		Ball b4 = new Ball(1);
		Ball b5 = new Ball(2.0f);
	
	}
}