import java.util.regex.*;

class RegexStringLiterals {
    public static void main(String args[]) {
        displayFind("lime","5 limes for $1");
        displayFind("java","Java Tutorials");
        displayFind("round","The wheels on the bus go round and round");
        displayFind(" ","The wheels on the bus go round and round");
        displayFind("53.254","107.1.53.254");
        displayFind(".","107.1.53.254");
        displayFind("c:\\\\","c:\\java\\");
    }

    static void displayFind(String regex, String searchMe) {
        boolean foundIt = false;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(searchMe);
        while(m.find()){
            System.out.println("Matcher found " + m.group() + " at index "+ m.start() + " for regex " + regex + " in string \"" + searchMe +"\"" );
            foundIt = true;
        }
        if(!foundIt){
            System.out.println("No matches found for " + regex + " in string \"" + searchMe +"\'");
        }
        System.out.println();	    
    }
}