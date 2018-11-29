
class TryCatchNFE {
    public static void main(String args[]) {
        Box box1 = new Box(5, 5, 8);
        Box box2 = new Box("10", "2", "4");

        System.out.println("The volume of box1 is: " + box1.getVolume());
        System.out.println("The volume of box2 is: " + box2.getVolume());
        
        try {
           Box box3 = new Box("Five", "Seven", "Three");
        } catch (NumberFormatException nfe) {
           System.out.println("String arguments must contain valid digits, unable to create box.");
        }
    }
}

class Box {
    private int length = 0;
    private int height = 0;
    private int width = 0;

    Box (int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box (String length, String height, String width) {
        this.length = Integer.parseInt(length);
        this.height = Integer.parseInt(height);
        this.width = Integer.parseInt(width);
    }

    int getVolume() {
        return (length * height * width);
    }
}
