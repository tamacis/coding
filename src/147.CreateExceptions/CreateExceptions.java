class InvalidMeasurementException extends Exception {
    InvalidMeasurementException() {
        super("Measurement argument cannot be 0 or negative");
    }
}

class InitializationIncompleteException extends Exception {
    InitializationIncompleteException() {
        super("Initialization of object state was not completed");
    }
}

class CreateExceptions {
    public static void main(String args[]) {
        
        BoxOldWay old1 = new BoxOldWay();
        if ( !(old1.setLength(4) && old1.setHeight(-6) && old1.setWidth(7)) )  {
            System.out.println("Invalid argument measurement!");
        }      
        System.out.println("The volume of old1 is: " + old1.getVolume());

        BoxOldWay old2 = new BoxOldWay(-5, 5, 8);
        System.out.println("The volume of old2 is: " + old2.getVolume());

        System.out.println("\n----Error handling----\n");
    
        BoxNewImproved new1 = null;
        try {	
            new1 = new BoxNewImproved( -5, 5, 8 );
        } catch (InvalidMeasurementException e) {
            System.out.println(e.getMessage());
            new1 = new BoxNewImproved(); 
        }
	
        try {
            System.out.println("The volume of new1 is: " + new1.getVolume());
        } catch (InitializationIncompleteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nEnd of program");
    }
}