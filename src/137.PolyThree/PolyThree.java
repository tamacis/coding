class PolyThree {
    public static void main(String args[]) {
        Car c1 = new Car();
        Car c2 = new HondaAccord();
        Car c3 = new ToyotaPrius();

        c1.averagePrice();
        c2.averagePrice();
        c3.averagePrice();

        System.out.println();
        c2.averagePrice(); // polymorphism invokes the method based on the object (instance) type
        c2.newCarSmell(); // static method (class method) invokes the method based on the reference variable type - no polymorphism
        //HondaAccord ha = new HondaAccord();
        //ha.newCarSmell();

        //System.out.println();
        //System.out.println("Remember, we can also directly call static methods ...");
        //Car.newCarSmell();
        //HondaAccord.newCarSmell();
    }
}

class Car { // implicitly extends object
    void averagePrice() {
        System.out.println("The average price of a new car is $28,400.");
    }
    static void newCarSmell() {
        System.out.println("Nothing quite like that new car smell!");
    }
}
class HondaAccord extends Car {
    @Override
    void averagePrice() {
        System.out.println("The average price of a new Honda Accord is $26,007.");
    }
    //@Override
    static void newCarSmell() { // method hiding - uncomment the @Override and see
        System.out.println("Hum ... is the new car smell really different based on the model???");
    }
}
class ToyotaPrius extends Car {
    @Override
    void averagePrice() {
        System.out.println("The average price of a new Toyota Prius is $23,450.");
    }
}

