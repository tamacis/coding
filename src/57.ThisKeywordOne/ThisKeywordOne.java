class ThisKeyword {
    public static void main(String args[]) {
	
        Box b = new Box(); 
        b.setLength(10);
        b.setHeight(2);		
        b.setWidth(5);
        System.out.println("Inside of the main method b = " + b);
        System.out.println("The volume of box b is: " + b.calculateVolume());
        System.out.println();

        Box c = new Box(4, 8, 3);
        System.out.println("Inside of the main method c = " + c);
        System.out.println("The volume of box c is: " + c.calculateVolume());
        System.out.println();

        Box d = new Box(7, 5, 6, "inches");
        System.out.println("Inside of the main method d = " + d);
        System.out.println("The volume of box d is: " + d.calculateVolume() + " cubic " + d.getUnitOfMeasurement());
        System.out.println();
    }
}

class Box {
    private int length = 0; 
    private int height = 0; 
    private int width = 0;
    private String unitOfMeasurement; 

    // Default constructor - Don't forget to always include this.
    Box() {
        super(); 
        System.out.println("Inside of the no argument constructor this = " + this);
    }

    // First Constructor created
    Box(int length, int height, int width) {
        System.out.println("Inside of the three parameter constructor this = " + this);
        this.length = length;
        this.height = height;
        this.width = width;
    } 
    
    // New Constructor
    Box(int length, int height, int width, String unitOfMeasurement ) {
        System.out.println("Inside of the four parameter constructor this = " + this);
        this.length = length;
        this.height = height;
        this.width = width;
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
}