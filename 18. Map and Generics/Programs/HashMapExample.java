
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap mp = new HashMap<>();
        mp.put(1, "Pravin");
        mp.put(2, "Sandesh");
        mp.put(3, "Sagar");

        System.out.println(mp);

        // Accessing using keys
        System.out.println(mp.get(1));

        // Getting keyset

        Set keySet = mp.keySet();
        Iterator itr = keySet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Collection values = mp.values();
        Iterator itr2 = values.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        Map.Entry entry = (java.util.Map.Entry) mp.entrySet().iterator().next();
        System.out.println(entry);
    }
}
