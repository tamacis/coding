
class ConstructorFive {
    public static void main(String args[]) {
	
        Box b = new Box(); 
        b.setLength(10);
        b.setHeight(2);		
        b.setWidth(5);
        System.out.println("The volume of box b is: " + b.calculateVolume() + " cubic " + b.getUnitOfMeasurement());
        System.out.println();

        Box c = new Box(4, 8, 3);
        System.out.println("The volume of box c is: " + c.calculateVolume() + " cubic " + c.getUnitOfMeasurement());
        System.out.println();

        Box d = new Box(18, 15, 21, "centimeters");
        System.out.println("The volume of box d is: " + d.calculateVolume() + " cubic " + d.getUnitOfMeasurement());
        System.out.println();

        Box e = new Box(4.5, 5, 5, "inches");
        System.out.println("The volume of box e is: " + e.calculateVolumeDouble() + " cubic " + e.getUnitOfMeasurement());
        System.out.println();
    }
}
class Box {
    private int length = 0; 
    private int height = 0; 
    private int width = 0;
    private String unitOfMeasurement; 

    private double lengthD = 0.0D; 
    private double heightD = 0.0D; 
    private double widthD = 0.0D;

    // Default constructor - Don't forget to always include this.
    Box() {
        //super();  remove this
        this(0, 0, 0, "inches");
    }

    // First Constructor created
    Box(int length, int height, int width) {
        this(length, height, width, "inches");
        //this.length = length; remove these now
        //this.height = height; remove these now
        //this.width = width; remove these now
    } 
    
    // Second Constructor
    Box(int length, int height, int width, String unitOfMeasurement ) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.unitOfMeasurement = unitOfMeasurement;
    }   
    
    // New Constructor
    Box(double lengthD, double heightD, double widthD, String unitOfMeasurement ) {
        this.lengthD = lengthD;
        this.heightD = heightD;
        this.widthD = widthD;
        this.unitOfMeasurement = unitOfMeasurement;
    } 
       
    void setLength (int length) {
        this.length = length;
    }
    int getLength () {
        return length;
    }

    void setHeight (int height) {
        this.height = height;
    }
    int getHeight () {
        return height;
    }

    void setWidth (int width) {
        this.width = width;
    }
    int getWidth () {
        return width;
    }

    void setUnitOfMeasurement (String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }
    String getUnitOfMeasurement () {
        return unitOfMeasurement;
    }

    // create a method to get the volume of the box
    int calculateVolume() {
       return (length * height * width);	
    }

    // create a method to get the volume of the box
    double calculateVolumeDouble() {
       return (lengthD * heightD * widthD);	
    }
}

