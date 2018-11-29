enum Sizes { // cannot be private or protected
    SMALL, MEDIUM, LARGE    
}; // optional semicolon

class EnumIntroduction {
    enum AvailableColors { RED, GREEN, BLUE }; // optional semicolon
    String s = "Hello World";

    public static void main(String args[]) {
        Sizes sRef = Sizes.MEDIUM;
        AvailableColors ac = AvailableColors.BLUE;
        
        if(sRef == Sizes.SMALL) {
            System.out.println("Small");
        } else if(sRef == Sizes.MEDIUM) { 
            System.out.println("Medium"); 
        } else if(sRef == Sizes.LARGE) {
            System.out.println("LARGE");
        }
        
        switch(ac){
            case RED:
                System.out.println("Red");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
        }

    }
}