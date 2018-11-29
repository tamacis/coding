class SuperclassConstructors {
    public static void main(String args[]) {
        CardboardBox b1 = new CardboardBox(5, 5, 5, "inches", "brown");
        CardboardBox b2 = new CardboardBox(14, 17, 13, "centimeters", "white");

        System.out.println("Box #1 is a " + b1.color + " cardboard box with a volume of: " + b1.returnVolume() + " cubic " + b1.unitOfMeasurement);
        System.out.println("Box #2 is a " + b2.color + " cardboard box with a volume of: " + b2.returnVolume() + " cubic " + b2.unitOfMeasurement);
    }
}

class Box {
    int length = 0;
    int height = 0;
    int width = 0;
    String unitOfMeasurement = "";

    Box() {
        super();
    }

    Box(int length, int height, int width, String unitOfMeasurement) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    int returnVolume() {
        return (length * height * width);
    }
}

class CardboardBox extends Box {     
    String color=""; 
    
    CardboardBox() {
        super();
    }

    CardboardBox(int length, int height, int width, String unitOfMeasurement, String color ) {
        super(length, height, width, unitOfMeasurement);
        this.color = color;
    }
} 
