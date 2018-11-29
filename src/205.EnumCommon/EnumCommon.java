enum Sizes { SMALL, MEDIUM, LARGE}

class EnumCommon {
    public static void main(String args[]) {
        Sizes sRef = Sizes.MEDIUM;
        System.out.println(sRef.name());
        System.out.println(sRef.ordinal());
        System.out.println();

        sRef = Sizes.valueOf("LARGE");
        System.out.println(sRef.name());
        System.out.println(sRef.ordinal());
        System.out.println();

        Sizes sArray[] = Sizes.values();
        for (Sizes s : sArray){
            System.out.println(s.name());
            System.out.println(s.ordinal());
        }
    }
}
