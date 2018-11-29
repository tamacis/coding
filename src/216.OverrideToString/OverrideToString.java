class Blah { 

    private int age = 10;
    private String name = "Billy";
    @Override
    public String toString() {
        return "age=" + age +
            ", name=" + name;
    }
}

class OverrideToString {
    public static void main(String args[]){
        System.out.println(new Blah().toString());
    }
}
