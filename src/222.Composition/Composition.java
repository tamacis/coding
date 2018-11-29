class Composition {
    public static void main(String args[]){
        Computer c = new Computer();
        System.out.println("\nBrowing the internet...");
        System.out.println("Writing some source code...");
        System.out.println("Saving work...\n");
        c.allDone();
        c = null; // critical for future aggregation tutorial
    }
}

class OperatingSystem {
    void bootUp() { System.out.println("OS is booting up"); }
    void shutDown() { System.out.println("OS is shutting down"); }
}

class PowerSupply {
    void turnOn() { System.out.println("Powering on"); }
    void turnOff() { System.out.println("Powering off"); }
}

class Computer {
    private OperatingSystem os = new OperatingSystem();
    private PowerSupply ps = new PowerSupply();

    Computer() {
        ps.turnOn();
        os.bootUp();
    }
    
    void allDone() {
        os.shutDown();
        ps.turnOff();
    }
}

