
class StringBuilderMethods {
    public static void main(String args[]) {        
        // int capacity() - the size of the internal available character sequence, generally 16 greater than actual character length 
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println("sb = " + sb);
        System.out.println("sb.capacity() = " + sb.capacity());

        // char charAt(int index) - returns the character at the specified index, remember the index begins at 0. 
        System.out.println("\nsb = " + sb);
        System.out.println("sb.charAt(6) = " + sb.charAt(6));

        // delete(int start, int end) - returns the character at the specified index, remember the index begins at 0. 
        System.out.println("\nsb = " + sb);
        System.out.println("sb.delete(5, 10) = " + sb.delete(5, 10));

        // insert(int offset, String str) - insert the characters at the specified index, remember the index begins at 0. 
        System.out.println("\nsb = " + sb);
        System.out.println("sb.insert(5, \" Worl\") = " + sb.insert(5, " Worl"));

        // deleteCharAt(int index) - delete the character at the specified index, remember the index begins at 0. 
        System.out.println("\nsb = " + sb);
        System.out.println("sb.deleteCharAt(5) = " + sb.deleteCharAt(5));

        // insert(int offset, String str) - insert the characters at the specified index, remember the index begins at 0. 
        System.out.println("\nsb = " + sb);
        System.out.println("sb.insert(5, \" \") = " + sb.insert(5, " "));

        // ensureCapacity(int minimumCapacity) - minimum  size of the internal available character sequence 
        System.out.println("\nsb = " + sb);
        sb.ensureCapacity(300);
        System.out.println("sb.ensureCapacity(300), new capacity = " + sb.capacity());

        // int indexOf(String str) - get the index of the specfied string, -1 is returned if not found
        System.out.println("\nsb = " + sb);
        System.out.println("sb.indexOf(\"Wor\") = " + sb.indexOf("Wor"));
        System.out.println("sb.indexOf(\"WOR\") = " + sb.indexOf("WOR"));

        // int length() - returns the length of the actual value of the instance
        System.out.println("\nsb = " + sb);
        System.out.println("sb.length() = " + sb.length());

        // replace(int start, int end, String str) - replaces the characters at the specified index
        System.out.println("\nsb = " + sb);
        System.out.println("sb.replace(6, 11, \"everybody!\") = " + sb.replace(6, 11, "everybody!"));

        // reverse() - reverse the order of all the characters 
        System.out.println("\nsb = " + sb);
        System.out.println("sb.reverse() = " + sb.reverse());
        sb.delete(0, sb.length());
        sb.append("Hello World");

        // setCharAt(int index, char ch) - change the character at the specified index, remember the index begins at 0. 
        System.out.println("\nsb = " + sb);
        sb.setCharAt(5, '#'); 
        System.out.println("sb.setCharAt(5, '#') = " + sb);
        sb.setCharAt(5, ' '); 
        System.out.println("sb.setCharAt(5, ' ') = " + sb);

        // setLength(int newLength) - sets the character length to the specified value, trims characters if less than current length.
        System.out.println("\nsb = " + sb);
        sb.setLength(5);
        System.out.println("sb.setLength(5) = " + sb);
        sb.append(" World");

        // String substring(int start, int end) - returns a new String object of the specfied characters
        System.out.println("\nsb = " + sb);
        System.out.println("sb.substring(6, 11) = " + sb.substring(6, 11));

        // trimToSize() - attempts to reduce the capacity of the current instance
        System.out.println("\nsb = " + sb);
        sb.ensureCapacity(300);
        System.out.println("sb.ensureCapacity(300), new capacity = " + sb.capacity());
        sb.trimToSize();
        System.out.println("sb.trimToSize(), new capacity = " + sb.capacity());
    }
}

