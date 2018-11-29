
class AbstractIntro {
    public static void main(String args[]) {
        Boeing787 commercial = new Boeing787("787", 590);
        commercial.summary(); 
        commercial.takeOff();
        commercial.land();

        System.out.println();

        FA18 fighter = new FA18("FA18",1190);
        fighter.summary();  
        fighter.takeOff();
        fighter.land();

        System.out.println();

        CessnaAmphibian caravan = new CessnaAmphibian("Cessna Amphibian", 213);
        caravan.summary();  
        caravan.takeOff();
        caravan.land();

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

    void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }
    int getTopSpeed() { return topSpeed; }

    void setModel(String model) { this.model = model; }
    String getModel() { return model; }

    void summary() { System.out.println("The top speed of a " + model + " is: " + topSpeed); }

    abstract void takeOff(); // abstract method - no code block/body
    abstract void land();  // abstract method - no code block/body    
}

class Boeing787 extends Airplane {
    Boeing787() { super(); }
    Boeing787(String model, int topSpeed) {
        super(model, topSpeed);
    }

    @Override
    void takeOff() {
        System.out.println("The 787 needs a very long runway to takeoff ...");
    }
    @Override
    void land() {
        System.out.println("The 787 needs a very long runway to land ...");
    }
} 

class FA18 extends Airplane {
    FA18 () { super(); }
    FA18 (String model, int topSpeed) {
        super(model, topSpeed);
    }

    @Override
    void takeOff() {
        System.out.println("The FA18 is launched off the deck of a aircraft carrier like a slingshot ...");
    }
    @Override
    void land() {    
        System.out.println("The FA18 is \'hooked\' by a catch cable when it lands on an aircraft carrier ...");
    }
} 

class CessnaAmphibian extends Airplane {
    CessnaAmphibian () { super(); }
    CessnaAmphibian (String model, int topSpeed) {
        super(model, topSpeed);
    }

    @Override
    void takeOff() {
        System.out.println("The Cessna Amphibian can take off from the water or a runway ...");
    }
    @Override
    void land() {    
        System.out.println("The Cessna Amphibian can land in the water or on a runway ...");
    }
} 
