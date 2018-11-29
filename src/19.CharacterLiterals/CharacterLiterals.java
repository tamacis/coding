class CharacterLiterals {
    public static void main(String args[]) {
        char a = 'A';
        char one = '1';
        char A = '\u0041'; 
        char C = '\u0043';
        char T = '\u0054';

        System.out.println(a);
        System.out.println(one);
        System.out.print(C);
        System.out.print(A);
        System.out.print(T);   
        System.out.println(); 
        // println acutally adds the numerical representation
        // instead of concating char                      
        System.out.println(C+A+T);
    }
}