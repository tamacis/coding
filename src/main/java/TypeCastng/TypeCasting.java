import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

abstract class Animal {
    private Map<String, Animal> friends = new HashMap<>();

    public void addFriend(String name, Animal animal) {
        friends.put(name, animal);
    }

    public Animal callFriend(String name) {
        return friends.get(name);
    }

    public <T extends Animal> T callFriendGeneric(String name) {
        return (T) friends.get(name);
    }

    public <T extends Animal> T callFriendClassCast(String name, Class<T> type) {
        return type.cast(friends.get(name));
    }

    abstract void talk();

}

class Dog extends Animal {
    public void bark() {
        out.println("Woof woof!");
    }

    @Override
    public void talk() {
        bark();
    }
}

class Duck extends Animal {
    public void quack() {
        out.println("Quack quack!");
    }

    @Override
    public void talk() {
        quack();
    }
}

class Mouse extends Animal {
    public void squeak() {
        out.println("Squeak Squeak!!");
    }

    @Override
    public void talk() {
        squeak();
    }
};

public class TypeCasting {
    public static void main(String... args) {
        Mouse jerry = new Mouse();
        jerry.addFriend("spike", new Dog());
        jerry.addFriend("quacker", new Duck());

        ((Dog) jerry.callFriend("spike")).bark();
        ((Duck) jerry.callFriend("quacker")).quack();

        jerry.callFriend("spike").talk();
        jerry.callFriend("quacker").talk();

        jerry.<Dog>callFriendGeneric("spike").bark();

        jerry.callFriendClassCast("spike", Dog.class).bark();
        jerry.callFriendClassCast("quacker", Duck.class).quack();
    }
}