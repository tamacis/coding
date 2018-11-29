class PolyTwo {
    public static void main(String args[]) {
        Car c1 = new Car();
        Car c2 = new HondaAccord();
        Car c3 = new ToyotaPrius();
        Car c4 = new FordMustang();
        Car c5 = new ShelbyGT350();
        Car c6 = new TeslaS();

        c1.averagePrice();
        c2.averagePrice();
        c3.averagePrice();
        c4.averagePrice();
        c5.averagePrice();
        c6.averagePrice();
        
        System.out.println();

        TaxIncentives ti1 = new ToyotaPrius();
        TaxIncentives ti2 = new TeslaS();

        ti1.displayRebate();
        ti2.displayRebate();
    
        System.out.println("\n---------------------\n");
        
        System.out.println("And now the fun begins...\n");

        Object cArray[] = { new Car(), new HondaAccord(), new ToyotaPrius(), new FordMustang(), new ShelbyGT350(), new TeslaS() } ;

        for(Object temp : cArray) {
            if (temp instanceof Car) {
                ((Car) temp).averagePrice();
            }        

            if (temp instanceof TaxIncentives) {
                ((TaxIncentives) temp).displayRebate();
            }
        }

    }
}

interface TaxIncentives {
    public abstract void displayRebate() ;    
}

class Car { // implicitly extends object
    void averagePrice() {
        System.out.println("The average price of a new car is $28,400.");
    }
}

class HondaAccord extends Car {
    @Override
    void averagePrice() {
        System.out.println("The average price of a new Honda Accord is $26,007.");
    }
}

class ToyotaPrius extends Car implements TaxIncentives {
    @Override
    void averagePrice() {
        System.out.println("The average price of a new Toyota Prius is $23,450.");
    }

    @Override
    public void displayRebate() {
        System.out.println("The Toyota Prius qualifies for a $4000 tax rebate.");
    }
}

class FordMustang extends Car {
    @Override
    void averagePrice() {
        System.out.println("The average price of a new Ford Mustang is $25,800.");
    }
}

class ShelbyGT350 extends FordMustang {
    @Override // comment this method and run to demonstrate the hierarchy.
    void averagePrice() {
        System.out.println("The average price of a new Shelby GT350 Mustang is $59,400.");
    }

    @Override
    public String toString() {
        return "The 2016 Shelby GT350 has a whopping 526 horsepower!";
    }
}

class TeslaS extends Car implements TaxIncentives {
    @Override // comment this method and run to demonstrate the hierarchy.
    void averagePrice() {
        System.out.println("The average price of a new Tesla S is $75,000.");
    }

    @Override
    public void displayRebate() {
        System.out.println("The Tesla S qualifies for a $6500 tax rebate.");
    }   
}