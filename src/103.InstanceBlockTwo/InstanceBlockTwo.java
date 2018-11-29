class InstanceBlockTwo {
    public static void main(String args[]) {
        new ChildClass().displayMessage();
    }
}

class ParentClass {
    ParentClass() {
        this(26);
        System.out.print("over ");
    }

    ParentClass(int pointlessVar) {
        this("huh?");
        System.out.print("fox jumps ");
    }

    ParentClass(String whatever) {
        super();
        System.out.print("brown ");
    }

    {
        System.out.print("the ");
    }

    {
        System.out.print("quick ");
    }

}

class ChildClass extends ParentClass {

    {
        System.out.print("the lazy ");
    }

    void displayMessage() {
        System.out.println("dog");
    }
}