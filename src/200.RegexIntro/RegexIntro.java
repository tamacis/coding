import java.util.regex.*;
class RegexIntro {
    public static void main(String args[]) {
        String searchMe = "The top of the mop is called a handle.";

        System.out.println("String indexOf top: "+ searchMe.indexOf("top"));
        System.out.println("String indexOf mop: "+ searchMe.indexOf("mop"));
    
        Pattern p = Pattern.compile("[mt]op");
        Matcher m = p.matcher(searchMe);
        while(m.find()){
            System.out.println("Matcher found "+m.group() + " at index "+ m.start());
        }

        System.out.println();	
        
        p = Pattern.compile("l{2}");
        m = p.matcher(searchMe);
        while(m.find()){
            System.out.println("Matcher found "+m.group() + " at index "+ m.start());
        }
    }
}
