class FinalReference {
    public static void main(String args[]) {
        Box myBox = new Box(5, 5, 5);        
        FinalInstanceTester fit = new FinalInstanceTester(myBox);
        fit.displayValues();
    
        System.out.println("-------Locals-------");

        final Box MISC_BOX = new Box(10, 10, 10);
        Box shoeBox = new Box(6, 15, 5);
        FinalLocalTester flt = new FinalLocalTester();
        flt.displayValues(MISC_BOX, shoeBox);
    }
}

class FinalInstanceTester {
    final Box BOX_ONE; // blank final reference instance variable
    final Box BOX_TWO = new Box(8, 8, 8);
    
    FinalInstanceTester() {
        super();
        BOX_ONE = new Box(); // must assign a value to a blank final reference instance variable in a constructor
    }
    FinalInstanceTester(Box paramBox) {
        BOX_ONE = paramBox; // must assign a value to a blank final reference instance variable in a constructor
    }
	
    void displayValues() {
        //BOX_ONE = new Box(12, 12, 12); // error, blank final must be initialized in a constructor
        BOX_ONE.displayDimensions("BOX_ONE");
        BOX_TWO.displayDimensions("BOX_TWO");
                         
        // BOX_ONE CANNOT change the reference to a different object. Final prevents that 
        //BOX_ONE = BOX_TWO; 

        // BOX_ONE MAY change the members of the object! Final does not prevent that
        BOX_ONE.length = 15;
        BOX_ONE.height = 15;
        BOX_ONE.width = 15;
        BOX_ONE.displayDimensions("BOX_ONE");
    }	
}

class FinalLocalTester {

      void displayValues(Box miscBox, final Box SHOE_BOX) {
        Box BLANK_BOX; // blank final local reference variable

        miscBox.displayDimensions("miscBox");        
        SHOE_BOX.displayDimensions("SHOE_BOX");
        
        // "Passing Variables to Methods and Constructors Tutorial" covers pass-by-value rules
        // pass-by-value rules dictate that the parameter miscBox (no final) can change its reference to an object, the parameter SHOE_BOX cannot     
        Box changeTo = new Box(41, 41, 41);
        miscBox = changeTo;
        miscBox.displayDimensions("miscBox");   

        // SHOE_BOX CANNOT change the reference to a different object. Final prevents that 
        // SHOE_BOX = changeTo; 

        // SHOE_BOX MAY change the members of the object! Final does not prevent that
        SHOE_BOX.length = 17;
        SHOE_BOX.height = 17;
        SHOE_BOX.width = 17;
        SHOE_BOX.displayDimensions("SHOE_BOX");    

        BLANK_BOX = new Box(33, 33, 33); // must initialize it before use
        BLANK_BOX.displayDimensions("BLANK_BOX");
    }

}

class Box {
    int length = 0;
    int height = 0;
    int width = 0; 
    
    Box() { 
        super(); 
    }   

    Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    void displayDimensions(String refName) {
        System.out.println("The dimensions of " + refName + " (" + this + ") are: " + length + ", " + height + ", " + width);
    }
}