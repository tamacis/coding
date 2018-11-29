class ConstructorOverloading {
    public static void main(String args[]) {
	
        Box b = new Box(); 
        b.setLength(10);
        b.setHeight(2);		
        b.setWidth(5);
        System.out.println("The volume of box b is: " + b.calculateVolume());

        Box c = new Box(4, 8, 3);
        System.out.println("The volume of box c is: " + c.calculateVolume());

        Box d = new Box(7, 5, 6, "inches");
        System.out.println("The volume of box d is: " + d.calculateVolume() + " cubic " + d.getUnitOfMeasurement());

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
    }

    // First Constructor created
    Box(int lengthParam, int heightParam, int widthParam) {
        length = lengthParam;
        height = heightParam;
        width = widthParam;
    } 
    
    // New Constructor
    Box(int lengthParam, int heightParam, int widthParam, String unitOfMeasurementParam ) {
        length = lengthParam;
        height = heightParam;
        width = widthParam;
        unitOfMeasurement = unitOfMeasurementParam;
    }      

    void setLength (int lengthParam) {
        length = lengthParam;
    }
    int getLength () {
        return length;
    }

    void setHeight (int heightParam) {
        height = heightParam;
    }
    int getHeight () {
        return height;
    }

    void setWidth (int widthParam) {
        width = widthParam;
    }
    int getWidth () {
        return width;
    }

    void setUnitOfMeasurement (String unitOfMeasurementParam) {
        unitOfMeasurement = unitOfMeasurementParam;
    }
    String getUnitOfMeasurement () {
        return unitOfMeasurement;
    }

    // create a method to get the volume of the box
    int calculateVolume() {
       return (length * height * width);	
    }
}