import java.util.ArrayList;
import java.util.List;

class WhyUseGenerics {

    public static void main(String[] args) {
//        Elimination of casts.
// The following code snippet without generics requires casting:

        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);
//When re-written to use generics, the code does not require casting:

        List<String> listg = new ArrayList<String>();
        listg.add("hello");
        String sg = listg.get(0);   // no cast

    }
}
