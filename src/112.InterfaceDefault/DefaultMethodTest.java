/*
 *   A default method must be explicitly declared default. Not to be confused with default
 *    (package-private) access.
 *   A default method is implicitly public.
 *   A default method may have only the following legal modifiers: public, default, and strictfp.
 *   A default method may be overridden in the implementing class.
 *   A default method does not have to be overridden in the implementing class.
 *   If you override the default method in an implementing class, you can still invoke the 
    interface method by using this syntax: InterfaceName.super.defaultMethod().
*/
class DefaultMethodTest {

    public static void main(String args[]) {

        HondaAccord accord = new HondaAccord("un-leaded gasoline");
        System.out.println("The engine of a Honda Accord burns " + accord.getFuelType());
        System.out.println("The Honda Accord is designed to safely carry " + accord.getMaxPassengers() + " passengers");
        //System.out.println("The Honda Accord has " + accord.getHorsePower("sedan") + " horsepower");
    }
}

interface Engine {
    String getFuelType();

    //int getHorsePower(String modelType); // Error - break all implementing classes

    //default int getHorsePower(String modelType) {
    //    return -1; // My intention really is for the implementing class to override this method
    //}
}

interface Passengers {
    int getMaxPassengers();    
}

class HondaAccord implements Engine, Passengers {
    String fuelType = "";
    static final int MAX_PASSENGERS = 5;
    HondaAccord() { super(); }
    HondaAccord(String fuelType) {
        this.fuelType = fuelType;
    }
    @Override
    public String getFuelType() {
        return fuelType;
    }
    @Override
    public int getMaxPassengers() {
        return MAX_PASSENGERS;
    }
    //@Override
    //public int getHorsePower(String modelType) {
    //    if (modelType.equals("sedan")) { 
    //        return 177; 
    //    }
    //    return Engine.super.getHorsePower(modelType);
    //}
    
}   