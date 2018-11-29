class ExceptionRethrow {
    public static void main(String args[]) {
        displayOurInt("zero");
        displayOurInt("one");
        displayOurInt("Two");
        displayOurInt("THREE");
        displayOurInt("fouR");
        displayOurInt("FiVE");
        displayOurInt("six");
        displayOurInt("7");
        displayOurInt("seven");
        displayOurInt("8");
        displayOurInt("Eight");
        displayOurInt("9");
        displayOurInt("nInE");
        displayOurInt("TEN");
        displayOurInt("sixty");
    }

    static void displayOurInt(String parseIt) {
        int i = 0;
        try {
            i = stringToInt(parseIt);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Unable to convert " + parseIt + " to a primitve int");
        }
    }

    static int stringToInt(String s) {
        int i = 0;
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            switch (s.toUpperCase()) {
                case "ONE":
                    return 1;
                case "TWO":
                    return 2;
                case "THREE":
                    return 3;
                case "FOUR":
                    return 4;
                case "FIVE":
                    return 5;
                case "SIX":
                    return 6;
                case "SEVEN":
                    return 7;
                case "EIGHT":
                    return 8;
                case "NINE":
                    return 9;        
            }
            throw e;
        }
        return i;
    }
}