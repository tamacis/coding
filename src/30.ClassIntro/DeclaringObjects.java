class DeclaringObjects {
    public static void main(String args[]) {
        int a;  // (data type) (variable name)
        Box myBox; // declare a variable myBox of type Box
        myBox = new Box(); // allocate a Box object
    	// myBox is now an object and we can access the Box method displayMessage		
        // We use the dot (.) operator to invoke the displayMessage method.
	    // object.member

        myBox.displayMessage();
    }
}