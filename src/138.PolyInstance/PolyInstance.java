class PolyInstance {
    public static void main(String args[]) {
        Car c1 = new Car();
        Car c2 = new HondaAccord();
        Car c3 = new ToyotaPrius();

        System.out.println(c1.price); 
        c1.averagePrice();  

        System.out.println(c2.price); // price is displayed based on the reference variable type - no polymorphism
        c2.averagePrice(); // method is invoked based on the object type - polymorphism!

        System.out.println(c3.price);
        c3.averagePrice();

        System.out.println("---------------------");

        HondaAccord ha = new HondaAccord();
        ToyotaPrius tp = new ToyotaPrius();

        System.out.println(ha.price);
        System.out.println(tp.price);

    }
}

class Car { 
    int price = 28_400;
    void averagePrice() {
        System.out.println("The average price of a new car is $" + price + ".\n");
    }

}

class HondaAccord extends Car {
    int price = 26_007; // not overriding - simply hiding the superclass price variable
    @Override
    void averagePrice() {
        System.out.println("The average price of a new Honda Accord is $" + price + ".\n");
    }
}

class ToyotaPrius extends Car {
    int price = 23_450; // not overriding - simply hiding the superclass price variable
    @Override
    void averagePrice() {
        System.out.println("The average price of a new Toyota Prius is $" + this.price + ".\n");
    }
}

