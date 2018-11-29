class StringBuilderInsert {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("0123456789");
        
        boolean b = true;
        sb.insert(3, b);
        System.out.println("insert(int offset, boolean b) = "  + sb);
        sb = new StringBuilder("0123456789");

        char c = '$';
        sb.insert(8, c);
        System.out.println("insert(int offset, char c) = "  + sb);
        sb = new StringBuilder("0123456789");

        char cArray[] = { 'H', 'E', 'L', 'L', 'O' };
        sb.insert(5, cArray);
        System.out.println("insert(int offset, char[] str) = "  + sb);
        sb = new StringBuilder("0123456789");

        sb.insert(5, cArray, 3, 2);
        System.out.println("insert(int index, char[] str, int offset, int len) = "  + sb);
        sb = new StringBuilder("0123456789");

        CharSequence cs1 = new String("java");
        sb.insert(5, cs1);
        System.out.println("insert(int dstOffset, CharSequence s) = "  + sb);
        sb = new StringBuilder("0123456789");

        CharSequence cs2 = new StringBuilder("HELLO");
        sb.insert(5, cs2, 3, 5);
        System.out.println("insert(int dstOffset, CharSequence s, int start, int end) = "  + sb);
        sb = new StringBuilder("0123456789");

        double d = 777.77;
        sb.insert(0, d);
        System.out.println("insert(int offset, double d) = "  + sb);
        sb = new StringBuilder("0123456789");

        float f = 555.55f;
        sb.insert(10, f);
        System.out.println("insert(int offset, float f) = "  + sb);
        sb = new StringBuilder("0123456789");

        int i = 432123;
        sb.insert(4, i);
        System.out.println("insert(int offset, int i) = "  + sb);
        sb = new StringBuilder("0123456789");

        long L = 8888888888888888888L;
        sb.insert(1, L);
        System.out.println("insert(int offset, long l) = "  + sb);
        sb = new StringBuilder("0123456789");

        Object o = new NullPointerException();
        sb.insert(5, o);
        System.out.println("insert(int offset, Object obj) = "  + sb);
        sb = new StringBuilder("0123456789");

        String s = new String("my string");
        sb.insert(3, s);
        System.out.println("insert(int offset, String str) = "  + sb);
        sb = new StringBuilder("0123456789");
        
    }
}   

