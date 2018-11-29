import java.util.regex.*;

class RegexCharactersTwo {
    public static void main(String args[]) {
        displayFind("[aeiou[0-9]]","5 limes for $1");
        displayFind("[aeiou0-9]","5 limes for $1");
        displayFind("[a-zA-Z]","Java Tutorials");
        displayFind("[a-z[A-Z]]","Java Tutorials");
        displayFind("[aeiou[^0-9]]","5 limes for $1");
        displayFind("[aeiou^0-9]","59 limes for $10");

        displayFind("[aeiou&&[ae]]","Java Tutorials");
        displayFind("[ae]","Java Tutorials");
        displayFind("[0-9&&[4-6]]","5 limes for $1");
        displayFind("[0-9&&[6-8]]","5 limes for $1");

        displayFind("[A-z&&[^aeiou]]","Java Tutorials");
        displayFind("[A-z&&[^aeiou]]","Java_[Tutorials]");
        displayFind("[a-z[A-Z]&&[^aeiou]]","Java_[Tutorials]");
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