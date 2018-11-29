import java.io.*;

class AssertionsTwo {

    static String stupidMethod() {
        name = "Billy"; // don't modify variable values - makes no sense anyway
        return "Invalid number of arguments!";
    }

    static String name;

    public static void main(String args[]) {
        assert (args.length > 0) : stupidMethod(); // don't validate public method parameters - use execption handling instead
        //if(args.length==0) {
        //    throw new IllegalArgumentException("Invalid number of arguments!");
        //} 

        System.out.println("Program complete.");

        if (args.length == 0) {
            throw new IllegalArgumentException("Invalid number of arguments!");
        } else {
            try {
                assert (args[0].equals("YES"));
            } catch (AssertionError e) {
                System.out.println(e.getMessage());
            }
            if (!args[0].equals("YES")) {
                System.out.println("Expecting YES as the first argument");
            }
        }

        System.out.print("Enter a number from 0-4: ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            try {
                int i = Integer.parseInt(br.readLine());
                if (i >= 5) {
                    System.out.println("Really??? Nice try - not!");
                    return;
                }
                switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Good job, you entered: " + i);
                    break;
                default:
                    assert (false) : "i=" + i;
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Really??? Nice try - not!");
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
