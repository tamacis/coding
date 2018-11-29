class HexadecimalLiterals {
    public static void main(String args[]) {
        byte a = 0X1; 
        byte b = 0xA; 
        short c = 0xf; // 15, note that the f is in lowercase
        short d = 0x10; // 16
        int e = 0xFF; // 255
        int f = 0xFFF; // 4095
        int g = 0xFFFF; // 65535
        char upperA = 0x41; // 65
        char upperB = 0x42; // 66
        long m = 0x7FFFFFFFFFFFFFFFL; // 9223372036854775807 
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(upperA);
        System.out.println(upperB);
        System.out.println(m);
    }
}