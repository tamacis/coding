/***
The first statement in a constructor must be a call to either super() or this(). 
If you do not explicitly code in a super(...) or this(...) statement, 
then the compiler will implicitly put in a default no-argument call to super().

Thats why you can have either.. super or this cause with this at least one of the
construcors will default to super() no args... or have a super(args) call.


***/

class Child extends Parent {
	
	Child() {
	this(0);
	System.out.println("In child class no-args constructor.");
	}

	Child(int a) {
	super(0);
	System.out.println("In child class int args constructor.");
	}

}

class Parent {
	Parent() {
	System.out.println("In parent class no-args constructor.");
	parentMethod();
	}
	
	Parent(int a) {
	System.out.println("In parent class int args constructor.");
	}

	void parentMethod() {
	System.out.println("In parent instance method.");
	}
}

public class ConstructorSuperThis {
	public static void main (String[] args) {
	new Child();
	}
}