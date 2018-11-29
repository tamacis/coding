
class MethodOverloadingOne {
    public static void main(String args[]) {
        Box b = new Box();
        int iResult = b.calculateVolume(5, 5, 5);
        System.out.println("Box dimensions: 5x5x5, volume = " + iResult);
        double dResult = b.calculateVolume(4.5, 5.2, 6.2);
        System.out.println("Box dimensions: 4.5x5.2x6.2, volume =  " + dResult);

        // invoke the overloaded methods without using a reference variable
        System.out.println("Box dimensions: 8x5x9, volume = " + new Box().calculateVolume(8, 5, 9));
        System.out.println("Box dimensions: 6.2x9.2x1.5, volume = " + (new Box().calculateVolume(6.2, 9.2, 1.5)));
    }
}

class Box {
    // overloaded method calculateVolume
    int calculateVolume(int length, int height, int width) {
        return (length * height * width);
    }    

    // overloaded method calculateVolume
    double calculateVolume(double length, double height, double width) { 
        return (length * height * width);
    }
}

