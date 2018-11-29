class SuperOverride {
    public static void main(String args[]) {
        new TopicSuperOverride().displayMessage();
    }
}

class Greeting {
    void displayMessage() {
        System.out.println("Hello everybody, I\'m Dan, welcome to my java tutorial series.");
    }
}

class Introduction extends Greeting {
    void displayMessage() {
        super.displayMessage();
        System.out.println("Throughout my tutorials ... by building on concepts from prior tutorials.");
    }
}

class TopicSuperOverride extends Introduction {
    void displayMessage() {
        super.displayMessage();
        System.out.println("This tutorial is about how the super keyword can affect method overriding.");
    }
}