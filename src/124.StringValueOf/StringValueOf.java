class StringValueOf {
    public static void main(String args[]) {
        int a = 956, b = 1045;
        String title = String.valueOf(a+b) + ": A Space Odyssey";
        System.out.println(title); // 2001: A Space Odyssey 

        boolean t = true;
        char upperA = 65;
        char silly[] = { '8', '6', '7', '5', '3', '0', '9' };
        double pi = 3.1415926535D;
        float normal = 98.6f;
        long sun = 94_510_000;
        
        String temp = "";

        temp = String.valueOf(t);
        System.out.println(temp);

        temp = String.valueOf(upperA);
        System.out.println(temp);

        temp = "Jenny, don\'t change your number, " + String.valueOf(silly) + " ...";
        System.out.println(temp);

        temp = "Jenny, don\'t change your number, " + String.valueOf(silly, 0, 3) + "-" + String.valueOf(silly, 3, 4) + " ...";
        System.out.println(temp);

        temp = "pi is just about equal to " + String.valueOf(pi);
        System.out.println(temp);

        temp = "A normal adult temperature in fahrenheit is: " + String.valueOf(normal);
        System.out.println(temp);

        temp = "The Earth follows an elliptical path around the Sun, \nat the aphelion (most distant point), it is " + String.valueOf(sun) + " miles away.";
        System.out.println(temp);

        temp = String.valueOf(new StringValueOf());
        System.out.println(temp);
    }	

    @Override
    public String toString() {
        return "Simple value returned by invoking the toString() method";
    }
}

