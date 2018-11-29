import java.util.regex.*;
class RegexCharactersOne {
    public static void main(String args[]) {
        displayFind("[aeiou]","Java Tutorials");
        displayFind("[bxy]","Java Tutorials");
        displayFind("f[oa]x","fax machine");
        displayFind("f[oa]x","the quick brown fox");
        displayFind("sim[ia]l[iae]r","catch misspellings like simaler");
        displayFind("col[ou]r","coloring book");
        displayFind("col[ou]r","colouring book");
        displayFind("[ou]","colouring book");

        displayFind("[^aeiou]","Java Tutorials");
        displayFind("[^bxy]","Java Tutorials");
        displayFind("f[^oa]x","fax machine");
        displayFind("f[^oa]x","the quick brown fox");
        displayFind("sim[^a]l[^ie]r","catch misspellings like simaler");
        displayFind("col[^ou]r","coloring book");
        displayFind("col[^ou]r","colouring book");
        displayFind("[^ou]","colouring book");

        displayFind("[a-d]","Java Tutorials");
        displayFind("[A-M]","Java Tutorials");
        displayFind("[1-5]","5 limes for $1");
        displayFind("[^a-d]","Java Tutorials");
        displayFind("[^1-5]","5 limes for $1");
        displayFind("col[o-u]r","coloring book");
        displayFind("col[o-u]r","colouring book");
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
