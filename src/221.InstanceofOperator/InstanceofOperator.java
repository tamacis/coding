class InstanceofOperator {
    public static void main(String args[]) {
        GiftBox giftbox = new GiftBox();
        CerealBox cerealbox = new CerealBox();
        Box box = new Box();

        giftbox.displayBoxType();
        System.out.println("giftbox instanceof GiftBox = " + (giftbox instanceof GiftBox));
        System.out.println("giftbox instanceof Box = " + (giftbox instanceof Box));
        System.out.println("giftbox instanceof Object = " + (giftbox instanceof Object));
        //System.out.println("giftbox instanceof CerealBox = " + (giftbox instanceof CerealBox));
        //System.out.println("giftbox instanceof Number = " + (giftbox instanceof Number));
        //System.out.println("giftbox instanceof box = " + (giftbox instanceof box));
        System.out.println();

        cerealbox.displayBoxType();
        System.out.println("cerealbox instanceof Cerealbox = " + (cerealbox instanceof CerealBox));
        System.out.println("cerealbox instanceof Box = " + (cerealbox instanceof Box));
        System.out.println("cerealbox instanceof Object = " + (cerealbox instanceof Object));
        System.out.println();

        box.displayBoxType();
        System.out.println("box instanceof Box = " + (box instanceof Box));
        System.out.println("box instanceof Object = " + (box instanceof Object));
        System.out.println("box instanceof CerealBox = " + (box instanceof CerealBox));
        System.out.println("box instanceof GiftBox = " + (box instanceof GiftBox));
        System.out.println();

        Box birthday = new GiftBox();
        Box cornsplotions = new CerealBox();
        Box brownbox = new Box();

        //boxInfo(birthday);
        //boxInfo(cornsplotions);
        //boxInfo(brownbox);

    }

    static void boxInfo(Box b) { 
        b.displayBoxType();
        //example of bad usage
        if (b instanceof GiftBox) {
            ((GiftBox)b).displaySweater();
        } else if (b instanceof CerealBox) {
            ((CerealBox)b).displayCereal();
        } else {
            System.out.println("I am holding misc contents");
        }
        System.out.println();
    }

}

class Box {
    void displayBoxType() {
        System.out.println("Just a regular old box");
    }
}

class GiftBox extends Box {
    @Override
    void displayBoxType() {
        System.out.println("I\'m a gift box!");
    }
    void displaySweater() {
        System.out.println("I'm hiding an ugly sweater.");
    }    
}

class CerealBox extends Box {
    @Override
    void displayBoxType() {
        System.out.println("I\'m a cereal box!");
    }
    void displayCereal() {
        System.out.println("I'm halfway filled with processed corn, riboflavin, and thiamin hydrochloride. Yummy yummy!");
    }   
}
