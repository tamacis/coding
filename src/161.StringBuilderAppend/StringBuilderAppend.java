class StringBuilderAppend {
    public static void main(String args[]) {
        boolean b = true;
        char c = ' ';
        char cPeriod[] = { '.', '\n' } ;
        char cQMark[] = { '?', '\n' };
        CharSequence cs1 = new String("He responds $");
        CharSequence cs2 = new String("????He hands the bellhop ????");
        double d = 30.00;
        float f = 27.00f;
        int i = 0;
        long L = 5;
        Object o1 = new String("Three traveling salesmen stop at a motel to spend the night");
        Object o2 = new String(" dollar bills and tells him to give the salesmen their refund");
        String s = "They ask the desk clerk how much for a room";
        StringBuffer sBuff = new StringBuffer("When the bellhop returns to the main desk, \nthe clerk informs the bellhop that the ");
        CharSequence cs3 = new StringBuilder("On the way back to the room, the bellhop thinks to himself ...\n");
        Object o3 = new StringBuilder("3 guys, 5 dollars - I'll pocket $2 and give them each a dollar back");
        CharSequence cs4 = new StringBuffer("He knocks on the door and hands them each a dollar back. \nEnd of story right");
        Object o4 = new StringBuffer("The bellhop kept $2.00, the room was originally $30.00");
	
        
        StringBuilder sb = new StringBuilder();
        sb.append(o1);
        sb.append(cPeriod);
        sb.append(s);
        sb.append(cQMark);
        sb.append(cs1);
        sb.append(d).append(i).append(cPeriod);
        sb.append("Each salesman pays $10 and the bellhop shows them to their room.\n");
        sb.append(sBuff);	
        sb.append(b);
        sb.append(" room rate should have been $25.00");
        sb.append(cPeriod);
        sb.append(cs2, 4, 25);
        sb.append(L);
        sb.append(o2);
        sb.append(cPeriod);
        sb.append(cs3);
        sb.append(o3);
        sb.append(cPeriod);
        sb.append(cs4);
        sb.append(cQMark);
        sb.append("At this point each of the salesmen paid $9.00 for the room, so $9.00 * 3 = $");
        sb.append(f).append(i).append(cPeriod);
        sb.append(o4).append(cPeriod);
        sb.append("Where did the other dollar go").append(cQMark);
        System.out.println(sb);
    }
}    

