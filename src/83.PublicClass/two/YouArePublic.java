package two;

public class YouArePublic {
    String message = "You are public in package TWO!";

    // there is a default public no-argument constructor right here
    // YouArePublic() { super(); }

    // YouArePublic(String message) {
    //    super();
    //    this.message = message;
    //}

    public void displayMessage() {
        System.out.println(message);
    }    
}