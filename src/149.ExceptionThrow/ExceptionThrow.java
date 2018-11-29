class ExceptionThrow {
    public static void main(String args[]) {
        Box box1 = new Box(10, 3, 4);
        System.out.println("The volume of box1 is: " + box1.calculateVolume());

        Box box2 = new Box(-6, 8, 7);
        System.out.println("The volume of box2 is: " + box2.calculateVolume());
    }
}

class Box {
    private int length = 0;
    private int height = 0;
    private int width = 0;

    Box(int length, int height, int width) {
        if(length <= 0 || height <= 0 || width <= 0 ) {
            throw new IllegalArgumentException(); // subclass of RuntimeException - unchecked exception
        }
        this.length = length;
        this.height = height;
        this.width = width;
    }  
    
    int calculateVolume() {
        return ( length * height * width );
    }  
}
