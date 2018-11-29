/*
  *  A static method cannot directly access a non-static instance variable. 
  *     An instance variable can only be accessed inside of a static method by reference.
  *  A static method can directly access a static class variable from within the same class.
  *  A static method can directly access a static class variable from another class.
  *  A static method cannot directly invoke a non-static method from within the same class. 
          A non-static method can only be invoked by reference.
  *  A static method can directly invoke a static method from within the same class.
  *  A static method can directly invoke a static method from another class.
  *  A static method cannot use the this keyword.
*/

class StaticIntro {
    public static void main(String args[]) {
        // only three people answered my craigslist ad: Bob, Mary and Larry.
        // They each put in a hard day at the office with the following results:
        
        // Bob's work
        FlipIt.heads++; // directly access the class variable
        FlipIt.heads++;
        FlipIt.tails++;
        FlipIt.tails++;
        FlipIt.heads++;

        // Larry loves objects and refuses to embrace direct access
        new FlipIt().heads++; // access the class variable using an instance
        new FlipIt().tails++;
        new FlipIt().heads++;
        new FlipIt().tails++;

        // Mary's work
        FlipIt.heads++;
        FlipIt.tails++;
        FlipIt.tails++;
        FlipIt.tails++;
        FlipIt.tails++;
        FlipIt.heads++;

        System.out.println("Our grand total for our first day is ...");
        System.out.println("Heads total: " + FlipIt.heads);
        System.out.println("Tails total: " + new FlipIt().tails);
    }
}

class FlipIt {
    static int heads = 0;
    static int tails = 0;
}
