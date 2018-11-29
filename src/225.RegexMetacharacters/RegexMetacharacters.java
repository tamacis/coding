import java.util.regex.*;

class RegexMetacharacters {
    public static void main(String args[]) {
        displayFind(".","107.1.53.254");
        displayFind("\\.","107.1.53.254");
        displayFind("\\Q.\\E","107.1.53.254");

        displayFind("...","Blah blah ... blah blah");
        displayFind("\\.\\.\\.","Blah blah ... blah blah");
        displayFind("\\Q...\\E","Blah blah ... blah blah");

        System.out.println("Searching for backslashes...");
        System.out.println("\\\\java\\\\");
        System.out.println("c:\\java\\");
        displayFind("\\\\java\\\\","c:\\java\\");


        displayFind("[41]","new int[14]");
        displayFind("\\Q[41]\\E","new int[14]");
        displayFind("\\Q[41]\\E","new int[41]");
        displayFind("\\[41\\]","new int[41]");
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

