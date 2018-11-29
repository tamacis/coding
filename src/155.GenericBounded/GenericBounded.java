class GenericBounded {
    public static void main(String args[]) {
        Box<Integer> box1 = new Box<Integer>(new Integer(6), new Integer(5), new Integer(3));
        Box<Integer> box2 = new Box<Integer>(7, 2, 10); // autoboxing parameters
        Box<Float> box3 = new Box<Float>(4.25f, 3.0f, 10.0f);
        Box<Double> box4 = new Box<Double>(11.5, 5.0, 6.5);
        Box<Byte> box5 = new Box<Byte>((byte)0xA, (byte)0x13, (byte)0xB);
         
        System.out.println("The volume of box1 is: " + box1.getVolume());
        System.out.println("The volume of box2 is: " + box2.getVolume());
        System.out.println("The volume of box3 is: " + box3.getVolume());
        System.out.println("The volume of box4 is: " + box4.getVolume());
        System.out.println("The volume of box5 is: " + box5.getVolume());
    }
}

class Box<T extends Number> {
    private T length;
    private T height;
    private T width;

    Box(T length, T height, T width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    double getVolume () {
        return (length.doubleValue() * height.doubleValue() * width.doubleValue());
    }
}
class GenericBounded {
    public static void main(String args[]) {
        Box<Integer> box1 = new Box<Integer>(new Integer(6), new Integer(5), new Integer(3));
        Box<Integer> box2 = new Box<Integer>(7, 2, 10); // autoboxing parameters
        Box<Float> box3 = new Box<Float>(4.25f, 3.0f, 10.0f);
        Box<Double> box4 = new Box<Double>(11.5, 5.0, 6.5);
        Box<Byte> box5 = new Box<Byte>((byte)0xA, (byte)0x13, (byte)0xB);
         
        System.out.println("The volume of box1 is: " + box1.getVolume());
        System.out.println("The volume of box2 is: " + box2.getVolume());
        System.out.println("The volume of box3 is: " + box3.getVolume());
        System.out.println("The volume of box4 is: " + box4.getVolume());
        System.out.println("The volume of box5 is: " + box5.getVolume());
    }
}

class Box<T extends Number> {
    private T length;
    private T height;
    private T width;

    Box(T length, T height, T width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    double getVolume () {
        return (length.doubleValue() * height.doubleValue() * width.doubleValue());
    }
}
