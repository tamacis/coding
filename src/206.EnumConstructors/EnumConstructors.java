enum Sizes {
    SMALL(4), MEDIUM(8), LARGE(12);

    private int ounces;

    Sizes(int ounces){
        this.ounces = ounces;
    }

    int getOunces() {
        return ounces;
    }
} 

class EnumConstructors {
    public static void main(String args[]) {
        Sizes sRef = Sizes.MEDIUM;
        System.out.println(sRef.name());
        System.out.println(sRef.getOunces() + " ounce hamburger patty.");
        System.out.println();

        Sizes sArray[] = Sizes.values();
        for(Sizes s : sArray){
            System.out.println(s.name());
            System.out.println(s.getOunces() + " ounce hamburger patty.");
        }
    }
}
