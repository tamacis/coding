/*
 *  Interface variables must be initialized when they are declared.
 * 
 *  Interface variable values cannot be changed after they are declared.
 * 
 *  The only modifiers that can be explicitly applied to an interface variable are:
 *  public, static, or final.
 * 
 *  All interface variables are implicity marked public, static, and final.
 * 
 *  Don't be fooled by what appears to be Default (Package-Private) access,
 *  public is the only access modifier allowed and implicitly required.
 * 
 */

class InterfaceVariables {
    public static void main(String args[]) {
        CheesyOnScreenKeyboard cosk = new CheesyOnScreenKeyboard();
        cosk.displayKeyPressed(2, 1);
        cosk.displayKeyPressed(1, 1);
        cosk.displayKeyPressed(3, 1);

        System.out.println("Look, you can directly access an interface variable: " + DigitalKeypad.AKey );
    }
}

interface DigitalKeypad {
    String AKey = "A"; // Looks like a default access variable, correct?
    public String BKey = "B"; 
    public static String CKey = "C";
    public static final String D_KEY = "D";
    // protected String EKey = "E"; // NO - the only modifiers that can be explicitly applied to interface variable are: public, static, or final.
    // int i;
    // i = 10; // NO - Interface variables must be initialized when they are declared.
    int i = 10; // YES initialized and declared.
    // i = 20; // NO - Interface variable values cannot be changed after they are declared.


    String keyPress(int xCoord, int yCoord);
}

class CheesyOnScreenKeyboard implements DigitalKeypad {

    @Override
    public String keyPress(int xCoord, int yCoord) {
        if (xCoord == 1 && yCoord == 1 )
            return AKey;
        else if (xCoord == 2 && yCoord == 1 ) {
            return this.BKey;
        } else if (xCoord == 3 && yCoord == 1 ) {
            return DigitalKeypad.CKey;
        } 
        return "";
    }

    void displayKeyPressed(int xCoord, int yCoord) {
        System.out.println("You pressed " + keyPress(xCoord, yCoord) );
    }
  
}