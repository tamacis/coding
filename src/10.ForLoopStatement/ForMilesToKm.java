class ForMilesToKm {    
    public static void main(String args[]) {
        int milesPerHour;
        double kilometersPerHour;

        System.out.println("MPH   KPH");
        for(milesPerHour = 25; milesPerHour <= 50; milesPerHour++) {
            kilometersPerHour = milesPerHour * 1.609344; // there are 1.609344 kilometers in a mile
            System.out.println(milesPerHour + "    " + kilometersPerHour );
        }
    }
}