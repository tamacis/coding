package two;

class Outsider {
    public void displayMessage() {
        System.out.println("I am an outsider in package TWO - good luck getting to me!");
    }    
}

public class Oops extends Outsider { 
    // nothing to see here but the public displayMessage() method I just inherited :0
}