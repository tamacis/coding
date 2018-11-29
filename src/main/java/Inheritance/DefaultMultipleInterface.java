
interface In {
	default void say() {
	System.out.println("Inside");
	}
}


interface Out {
	default void say() {
	System.out.println("Outside");
	}
}

/* Uncomment to see the error */

//class Location implements In, Out {
//}
//
//class MultipleInterface {
//	public static void main(String[] args) {
//	new Location().say();	// Which one to call ambuigity	
//	}
//}

