class PolyOne {
    public static void main(String args[]) {
        Car c1 = new Car();
        Car c2 = new HondaAccord();
        Car c3 = new ToyotaPrius();
        Car c4 = new FordMustang();
        Car c5 = new ShelbyGT350();

        c1.averagePrice();
        c2.averagePrice();
        c3.averagePrice();
        c4.averagePrice();
        c5.averagePrice();
    
        System.out.println();
        
        Car cArray[] = { new Car(), new HondaAccord(), new ToyotaPrius(), new FordMustang(), new ShelbyGT350() } ;

        for(Car temp : cArray) {
            System.out.println(temp.toString());
        }

    }
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

class ToyotaPrius extends Car {
    @Override
    void averagePrice() {
        System.out.println("The average price of a new Toyota Prius is $23,450.");
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
