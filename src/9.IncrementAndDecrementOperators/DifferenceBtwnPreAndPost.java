public class DifferenceBtwnPreAndPost {
    public static void main(String args[]) {
        int d = 5;
        
        // cswl - comment
        // It actually 5 and 7.. unlike the tutorial says
        // So it's not until that statement has finished executing
        // But until the next expression
        // System.out.println(d++ + d + " == " + ++d);
        // Which prints 11 = 7
        System.out.print("Is d++ == ++d? ");
        System.out.println(d++ + " == " + ++d); 
        d = 5;
        System.out.println(d++ == ++d); // false, why?
        /*
            When d++ is evaluated on the left side of the relational operator ==, 
            the value of d is still 5 because the statement has not finished executing.            
            The postfix++ operator will not change the value of d until the statement has finished execution.
            Remember - all Java statements (except blocks) are terminated by a semicolon.
            When ++d is evaluated on the right side of the relational operator ==,
            the value of d is immediately changed to 6 because the ++prefix operator changes the value prior to statement completion.
            The expression d++ == ++d is literally 5 == 6, which of course is false.
        */
        System.out.println("What is the value of d now that the statement has executed? d="+d); // 7, think about it.
        System.out.println();
        System.out.println("--------------------");
        System.out.println("One last thing on Prefix and Postfix differences");	
        System.out.println();

        d = 5; //change d back to 5
        
        System.out.print("Is ++d == d++? ");
        System.out.println(++d + " == " + d++); 
        d = 5;
        System.out.println(++d == d++); // true, why?
        /*
            When ++d is evaluated on the left side of the relational operator ==,
            the value of d is immediately changed to 6 because the ++prefix operator changes the value prior to statement completion.
            When d++ is evaluated on the right side of the relational operator ==, 
            the value of d is still 6 because the statement has not finished executing.            
            The postfix++ operator will not change the value of d until the statement has finished execution.
            Remember - all Java statements (except blocks) are terminated by a semicolon.
            The expression ++d == d++ is literally 6 == 6, which of course is true.
        */
       System.out.println("What is the value of d now that the statement has executed? d="+d); // 7, think about it.
    }
}
