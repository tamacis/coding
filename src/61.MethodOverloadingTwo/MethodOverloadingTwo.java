class MethodOverloadingTwo {
    public static void main(String args[]) {
        byte bL = 5, bH = 5, bW = 5;
        System.out.println("Box with byte arguments, volume = " + new Box().calculateVolume(bL, bH, bW));
        
        short sL = 6, sH = 6, sW = 6;
        System.out.println("Box with short arguments, volume = " + new Box().calculateVolume(sL, sH, sW));

        char cL = 7, cH = 7, cW = 7;
        System.out.println("Box with char arguments, volume = " + new Box().calculateVolume(cL, cH, cW));

        int iL = 8, iH = 8, iW = 8;
        System.out.println("Box with int arguments, volume = " + new Box().calculateVolume(iL, iH, iW));

        long lL = 9L, lH = 9L, lW = 9L;
        System.out.println("Box with long arguments, volume = " + new Box().calculateVolume(lL, lH, lW));

        float fL = 5.3f, fH = 5.4f, fW = 5.5f;
        System.out.println("Box with float arguments, volume = " + new Box().calculateVolume(fL, fH, fW));

        double dL = 6.3d, dH = 6.4d, dW = 6.5d;
        System.out.println("Box with double arguments, volume = " + new Box().calculateVolume(dL, dH, dW));
    }
}

class Box {
    Box() {
        super();
        System.out.println("----------");
    }

    //after running once, comment this method out and run again
    // int calculateVolume(byte length, byte height, byte width) {
    //     System.out.println("In byte parameter overloaded method");
    //     return (length * height * width);
    // }  
    //after running once, comment this method out and run again
    int calculateVolume(short length, short height, short width) {
        System.out.println("In short parameter overloaded method");
        return (length * height * width);
    }  
    //after running once, comment this method out and run again
    int calculateVolume(char length, char height, char width) {
        System.out.println("In char parameter overloaded method");
        return (length * height * width);
    }  

    int calculateVolume(int length, int height, int width) {
        System.out.println("In int parameter overloaded method");
        return (length * height * width);
    }
    
    long calculateVolume(long length, long height, long width) {
        System.out.println("In long parameter overloaded method");
        return (length * height * width);
    }  
    //after running once, comment this method out and run again
    float calculateVolume(float length, float height, float width) {
        System.out.println("In float parameter overloaded method");
        return (length * height * width);
    } 

    double calculateVolume(double length, double height, double width) {
        System.out.println("In double parameter overloaded method");
        return (length * height * width);
    } 
}
