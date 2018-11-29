class BoxOldWay { // no error handling - rely on method return values for success/failure
    private int length = 0;
    private int height = 0;
    private int width = 0;

    BoxOldWay () { 
        super(); 
    }
    BoxOldWay (int length, int height, int width) { // what do we do about the constructor???
        this.length = length;
        this.height = height;
        this.width = width;
    }

    boolean setLength(int length) { // we can't be sure that the developer will check the return value!
        if (length <= 0) {
            return false;
        }
        this.length = length;
        return true;
    }

    boolean setHeight(int height) {
        if (height <= 0) {
            return false;
        }
        this.height = height;
        return true;
    }

    boolean setWidth(int width) {
        if (width <= 0) {
        return false;
    }
        this.width = width;
        return true;
    }

    int getVolume() { // we can't ensure that 0 values aren't part of the equation
        return (length * height * width);
    }
}
