class FinalPrimitives {
    public static void main(String args[]) {
        FinalInstanceTester fit = new FinalInstanceTester((byte) 127);
        fit.displayValues();

        System.out.println("-------");
        short length = 4;
        final short height = 4;
        FinalLocalTester flt = new FinalLocalTester();
        System.out.println("Volume = " + flt.calculateVolume(length, height, 4));
    }
}

class FinalInstanceTester {
    final byte BYTE_TEST; // blank final instance variable
    final int INT_TEST = 45; // final instance variable
    final boolean TRUE_VALUE = true; // final instance variable
    final char UPPER_A = 'A'; // final instance variable

    FinalInstanceTester() {
        super();
        BYTE_TEST = 0; // must assign a value to a blank final instance variable in a constructor
    }

    FinalInstanceTester(byte paramValue) {
        BYTE_TEST = paramValue; // must assign a value to a blank final instance variable in a constructor
    }
	
    void displayValues() {
        //BYTE_TEST = 127; // error, must be initialized in a constructor
        //INT_TEST++; // error, cannot change the value of a variable marked final once it has been initialized.
        System.out.println(BYTE_TEST); // error, if not initialized in a constructor.
        System.out.println(INT_TEST);
        System.out.println(TRUE_VALUE);
    }	
}

class FinalLocalTester {

    // Method parameter variables are basically implemented as local variables. 
    // They have the same visibility (not outside of the method) and lifetime (created on invoking a method, destroyed on method return). 
    // Technically speaking, Oracle splits parameter and local variables into separate categories, but to my knowledge, there is no difference.
    int calculateVolume(final short length, short height, int width) {
        //length++; // error, cannot change the value of a variable marked final once it has been initialized.
        height++;
        width++; 
		
        final int ENLARGER; // blank final local variable
        ENLARGER = 2;
        //ENLARGER++; // error, cannot change the value of a variable marked final once it has been initialized.
        final int SHRINKER = 2; // final local variable
        //SHRINKER--; // error, cannot change the value of a variable marked final once it has been initialized.
        return (length * height * width *  ENLARGER / SHRINKER);		
    }
}
