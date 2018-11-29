class StringSubstring {
    public static void main(String args[]) {
        String s = "0123456789";
        String version1 = s.substring(4);
        System.out.println("version1 = " + version1); 

        String version2 = s.substring(4, 8);
        System.out.println("version2 = " + version2); // version2 = 4567

        //String error = s.substring(8, 12); // out of bounds exception
        //String error = s.substring(-1, 4); // out of bounds exception
        //String error = s.substring(8, 4); // out of bounds exception
    }
}

