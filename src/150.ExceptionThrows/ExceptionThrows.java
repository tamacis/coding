import java.io.*;
class ExceptionThrows {
    public static void main(String args[]) {
        ThrowSomeStuff tss = new ThrowSomeStuff();
    
        try {
            tss.throwAnIOE();
        } catch ( IOException e) {
            System.out.println("Caught the IOException: " + e);
        }

        try {
            tss.makeBoxError();
        } catch (Exception e ) {
            System.out.println("Caught the box exception: " + e.getMessage());
        }
    }
}

class ThrowSomeStuff {   
    void throwAnIOE() throws IOException {
        throw new IOException();
    }
    void makeBoxError() throws InvalidMeasurementException {
        Box b = new Box( 9, -5, 4);
    }
}

class Box {
    private int length = 0;
    private int height = 0;
    private int width = 0;

    Box(int length, int height, int width) throws InvalidMeasurementException {
        if (length <= 0 || height <= 0 || width <= 0) {
            throw new InvalidMeasurementException();
        }
        this.length = length;
        this.height = height;
        this.width = width;
    }

    int getVolume() {
        return (length * height * width);
    }
}

class InvalidMeasurementException extends Exception {
    InvalidMeasurementException() {
        super("Measurement argument cannot be 0 or negative");
    }
}