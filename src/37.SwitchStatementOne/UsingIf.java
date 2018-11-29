class UsingIf {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Invalid number of arguments");
            return; // return will terminate execution of the main method
        }

        int numberOfDays = 0;
    
        // don't worry about the .equals yet - I will cover in great detail in a future tutorial
        // for now, just understand that .equals() is checking if args[0] is essentially equal to string literal "month value"
        // The String class is not a primitive data type, it is an object (a special one even then),
        // so different rules apply to the == operator.
        if (args[0].equals("January")) { 
            numberOfDays = 31;			
        } else if (args[0].equals("February")) {
            numberOfDays = 28;			
        } else if (args[0].equals("March")) {
            numberOfDays = 31;			
        } else if (args[0].equals("April")) {
            numberOfDays = 30;			
        } else if (args[0].equals("May")) {
            numberOfDays = 31;			
        } else if (args[0].equals("June")) {
            numberOfDays = 30;			
        } else if (args[0].equals("July")) {
            numberOfDays = 31;			
        } else if (args[0].equals("August")) {
            numberOfDays = 31;			
        } else if (args[0].equals("September")) {
            numberOfDays = 30;			
        } else if (args[0].equals("October")) {
            numberOfDays = 31;			
        } else if (args[0].equals("November")) {
            numberOfDays = 30;			
        } else if (args[0].equals("December")) {
            numberOfDays = 31;			
        } else {
            System.out.println("Invalid month argument. Java is a case sensitive language. Valid months are:");
            System.out.println("January\nFebruary\nMarch\nApril\nMay\nJune");
            System.out.println("July\nAugust\nSeptember\nOctober\nNovember\nDecember");
            return; 
        }

        if (numberOfDays == 28) {
            System.out.println("February has 28 days unless the year is evenly divisible by 4, if so, it has 29 days.");
        } else {
            System.out.println(args[0] + " has " + numberOfDays + " days.");
        }
    }
}
