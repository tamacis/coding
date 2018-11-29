
class InheritanceIntro {
    public static void main(String args[]) {
        CardboardBox cb1 = new CardboardBox();
        CardboardBox cb2 = new CardboardBox();

        cb1.length = 5;
        cb1.height = 5;
        cb1.width = 5;
        cb1.unitOfMeasurement = "inches";
        cb1.color = "brown";

        cb2.length = 16;
        cb2.height = 41;
        cb2.width = 10;
        cb2.unitOfMeasurement = "centimeters";
        cb2.color = "white";

        System.out.println("Box #1 is a " + cb1.color + " cardboard box with a volume of: " + cb1.returnVolume() + " cubic " + cb1.unitOfMeasurement);
        System.out.println("Box #2 is a " + cb2.color + " cardboard box with a volume of: " + cb2.returnVolume() + " cubic " + cb2.unitOfMeasurement);
    }
}

class Box {
    int length = 0;
    int height = 0;
    int width = 0;
    String unitOfMeasurement = "";

    int returnVolume() {
        return (length * height * width);
    }
}


// Cardboard box is the child or subclass, Box is the parent or superclass
class CardboardBox extends Box { 
    String color=""; // only member declared in the Cardboardbox class
    // the 'extends Box' above inherits all of the members of the Box class 
}
    


class InheritanceIntro {
    public static void main(String args[]) {
        CardboardBox cb1 = new CardboardBox();
        CardboardBox cb2 = new CardboardBox();

        cb1.length = 5;
        cb1.height = 5;
        cb1.width = 5;
        cb1.unitOfMeasurement = "inches";
        cb1.color = "brown";

        cb2.length = 16;
        cb2.height = 41;
        cb2.width = 10;
        cb2.unitOfMeasurement = "centimeters";
        cb2.color = "white";

        System.out.println("Box #1 is a " + cb1.color + " cardboard box with a volume of: " + cb1.returnVolume() + " cubic " + cb1.unitOfMeasurement);
        System.out.println("Box #2 is a " + cb2.color + " cardboard box with a volume of: " + cb2.returnVolume() + " cubic " + cb2.unitOfMeasurement);
    }
}

class Box {
    int length = 0;
    int height = 0;
    int width = 0;
    String unitOfMeasurement = "";

    int returnVolume() {
        return (length * height * width);
    }
}

class CardboardBox extends Box { // Cardboard box is the child or subclass, Box is the parent or superclass
    
    String color=""; // only member declared in the Cardboardbox class
    // the 'extends Box' above inherits all of the members of the Box class 
}
    

