/*
 *   The instance initialization block is invoked once every time an instance of a class is created.
 *   The instance initialization block is invoked directly after a call to super(). 
 *   Do not forget about the implicit super() call if you do not explicitly put it in your constructor.
 *   Multiple instance initialization blocks execute top-down.
 *
*/

import java.time.*; // jdk 1.8 and above ... type "javac - version" at CMD to find out
import java.time.format.*;

class InstanceBlockOne {
    public static void main(String args[]) {
        if (args.length == 0) {    
            new Welcome();
        } else {
            new Welcome(args[0]);
        }
    }
}

class Welcome {
    Welcome() {
        super();
    }

    Welcome(String name) {
        super();
        System.out.println("Welcome back " + name);
    }

    // instance initialization block
    {
        System.out.println();

        int hour = LocalDateTime.now().getHour();
        if (hour <= 11) {
            System.out.println("Good Morning!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good Afternoon!");
        } else if (hour >= 18 && hour < 21) {
            System.out.println("Good Evening!");
        } else  {
            System.out.println("Good Night!");
        }

        // don't worry the syntax on the next line - just know that it returns the current date.
        System.out.println("Today is: " + LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("eeee, MMMM dd, yyyy")));
    }

    // Methods ...

}