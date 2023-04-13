import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {

        // In hashtable we cannot insert null value
        // If we try to insert null values then it will throw NullPointerException

        Hashtable ht = new Hashtable();
        ht.put(1, "Pravin");
        ht.put(2, "Shedbale");

        System.out.println(ht);

        ht.putIfAbsent(1, "Aman");

        System.out.println(ht);
    }
}
