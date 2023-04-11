import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add("Pravin");
        list.add("Vijaykumar");
        list.add("Shedbale");

        System.out.println(list);

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
