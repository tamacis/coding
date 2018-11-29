
import java.util.Arrays;

class StringTwo {
        public static void main(String args[]) {
                char myChars[] = { 'A', 'B', 'C' }; // an array is an object
                StringLike s = new StringLike(myChars);
                System.out.println(s);

                myChars[0] = 'D';
                myChars[1] = 'E';
                myChars[2] = 'F';
                System.out.println(s);
        }
}

final class StringLike {
        private final char value[];

        StringLike(char value[]) {
                this.value = Arrays.copyOf(value, value.length); // defensive copying
        }

        @Override
        public String toString() {
                return new String(this.value);
        }
}

//class StringTwo extends StringLike {
/* myChars[0] = 'D';
myChars[1] = 'E';
myChars[2] = 'F';
//s.changeValue(myChars);
System.out.println(s);
*/
//final class StringLike { // final class cannot be extended
//private final char value[]; // once assigned, final reference cannot be reassigned to a different object instance

//void changeValue(char value[]) {
//	this.value = value; // pass-by-value, remember an array is an object!
//}	
//@Override
//public String toString() {
//	return new String(this.value);	
//}	
