class StringBuilderIntro {
    public static void main(String args[]) {
        StringBuilder s1 = new StringBuilder();
        System.out.println("s1 length: " + s1.length());
        System.out.println("s1 capacity: " + s1.capacity());

        StringBuilder s2 = new StringBuilder(300);
        System.out.println("s2 length: " + s2.length());
        System.out.println("s2 capacity: " + s2.capacity());

        StringBuilder s3 = new StringBuilder("Hello World");
        System.out.println("s3 length: " + s3.length());
        System.out.println("s3 capacity: " + s3.capacity());

        System.out.println("\n------\n");

        String s = new String("Hello");
        StringBuilder sb = new StringBuilder("Hello");

        s.concat(" World");
        sb.append(" World");

        System.out.println("s = " + s);	
        System.out.println("sb = " + sb);
    }
}
