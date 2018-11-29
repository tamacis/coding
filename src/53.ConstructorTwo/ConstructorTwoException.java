
class ConstructorTwoException {
    public static void main(String args[]) {
        Box b = new Box(10, 10, 2);
        System.out.println("The volume of our box is: " + b.calculateVolume());

    }
}

class Box {
    private int length = 0;
    private int height = 0;
    private int width = 0;

    //constructor
    Box(int lengthParam, int heightParam, int widthParam) throws AssertionError {
        if ( lengthParam <= 0 || heightParam <= 0 || widthParam <= 0) {
            throw new AssertionError("Unexpected value in one of the arguments.");
        }
        length = lengthParam;
        height = heightParam;
        width = widthParam;

    }

    int calculateVolume() {
        return (length * height * width);
    }
}