
class InterfaceIntro {
    public static void main(String args[]) {
        Boeing787 commercial = new Boeing787("787", 590,"jet fuel");
        commercial.summary(); 
        commercial.takeOff();
        System.out.println("The engines of a 787 burn " + commercial.getFuelType());
        System.out.println("A 787 can safely carry up to " + commercial.getMaxPassengers() + " passengers");

        System.out.println();
        HondaAccord accord = new HondaAccord("Accord", "sedan", "un-leaded gasoline");
        accord.summary();
        accord.fastenSeatBelts();
        System.out.println("The engine of a Honda Accord burns " + accord.getFuelType());
        System.out.println("The Honda Accord is designed to safely carry " + accord.getMaxPassengers() + " passengers");

    }
}

abstract class Airplane {
    private String model = "";
    private int topSpeed = 0;

    Airplane() { super(); }
    Airplane(String model, int topSpeed) { 
        this.model = model;
        this.topSpeed = topSpeed;
    }

    void summary() { System.out.println("The top speed of a " + model + " is: " + topSpeed); }

    abstract void takeOff(); // abstract method - no code block/body
}

abstract class Car {
    private String model = "";
    private String carType = "";

    Car() { super(); }    
    Car(String model, String carType) {
        this.model = model;
        this.carType = carType;
    }

    void summary() { System.out.println("The " + model + " is a " + carType  ); }

    abstract void fastenSeatBelts();
}

interface Engine {
    String getFuelType();
}

interface Passengers {
    int getMaxPassengers();    
}

class Boeing787 extends Airplane implements Engine, Passengers {
    private String fuelType = "";
    static final int MAX_PASSENGERS = 335;

    Boeing787() { super(); }
    Boeing787(String model, int topSpeed, String fuelType) {
        super(model, topSpeed);
        this.fuelType = fuelType;
    }
    @Override
    void takeOff() {
        System.out.println("The 787 needs a very long runway to takeoff ...");
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
    @Override
    public int getMaxPassengers() {
        return MAX_PASSENGERS;
    }

} 

class HondaAccord extends Car implements Engine, Passengers {
    private String fuelType = "";
    static final int MAX_PASSENGERS = 5;

    HondaAccord() { super(); }
    HondaAccord(String model, String carType, String fuelType) {
        super(model, carType);
        this.fuelType = fuelType;
    }

    @Override
    void fastenSeatBelts() {
        System.out.println("Safety first! Pull the seatbelt over your shoulder and lap and click it together.");
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
    @Override
    public int getMaxPassengers() {
        return MAX_PASSENGERS;
    }
}
