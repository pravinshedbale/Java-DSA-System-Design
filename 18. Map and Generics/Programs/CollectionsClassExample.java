import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("Abhijeet");
        list1.add("Zaheer");
        list1.add("Ashneer");
        list1.add("Pravin");
        list1.add("Bina");
        list1.add("Cameron");

        System.out.println(list1);

        Collections.sort(list1);

        System.out.println(list1);

        System.out.println(Collections.binarySearch(list1, "Pravin"));
        System.out.println(Collections.binarySearch(list1, "Pravins"));

        Collections.rotate(list1, 2);

        System.out.println(list1);

        Collections.shuffle(list1);
        System.out.println(list1);

        System.out.println(Collections.frequency(list1, "Pravin"));
    }
}
