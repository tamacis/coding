class ConstructorFour {
    public static void main(String args[]) {
	
        Box b = new Box(); // default no-argument constructor no longer exists, 
                    // so the new operator cannot find a matching constructor anymore.
		
        if (b.setLength(10) && b.setHeight(2) && b.setWidth(5)) {
            System.out.println("The length of our box is: " + b.getLength());
            System.out.println("The height of our box is: " + b.getHeight());
            System.out.println("The width of our box is: " + b.getWidth());
            System.out.println("The volume of our box is: " + b.calculateVolume());
        } else {
            System.out.println("Unexpected value in one of the dimension arguments.");
        }
    }
}

class Box {
    private int length = 0; 
    private int height = 0; 
    private int width = 0; 

    //constructor
    Box(int lengthParam, int heightParam, int widthParam) {
        length = lengthParam;
        height = heightParam;
        width = widthParam;
    }  

    boolean setLength (int lengthParam) {
        if (lengthParam >= 1) {
            length = lengthParam;
            return true;
        } else {
            return false;
        }
    }
    int getLength () {
        return length;
    }

    boolean setHeight (int heightParam) {
        if (heightParam >= 1) {
            height = heightParam;
            return true;
        } else {
            return false;
        }
    }
    int getHeight () {
        return height;
    }

    boolean setWidth (int widthParam) {
        if (widthParam >= 1) {
            width = widthParam;
            return true;
        } else {
            return false;
        }
    }
    int getWidth () {
        return width;
    }

    // create a method to get the volume of the box
    int calculateVolume() {
       return (length * height * width);	
    }
}
