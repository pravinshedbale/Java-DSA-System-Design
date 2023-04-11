import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafe {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        for (Object i : list1) {
            System.out.println(Integer.parseInt(i.toString()));

            // list1.add(19);

            // above line will lead to infinite loop execution
        }
        System.out.println("--------------Fail Fast------------------");
        // Fail Fast
        Iterator it1 = list1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());

            // list1.add(19);

            // this line will throw the ConcurrentModificationException because we are
            // trying concurrent modification on the collection that is currently being
            // accessed.
        }
        System.out.println("--------------Fail Safe------------------");
        // Fail Safe Exception

        CopyOnWriteArrayList list2 = new CopyOnWriteArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        Iterator it2 = list2.iterator();

        while (it2.hasNext()) {
            System.out.println(it2.next());

            list2.add(19);

            // On this line execution is terminated without throwing exception means program
            // safely fails on attempt of concurrent modification
        }
    }
}
