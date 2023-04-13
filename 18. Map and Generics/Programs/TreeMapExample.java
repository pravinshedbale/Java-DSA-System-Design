import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();

        // TreeMap doesnt maintain insertion order but it stores record in sorted order.

        tm.put(2, "Sandesh");
        tm.put(3, "Rohan");
        tm.put(1, "Pravin");

        System.out.println(tm);
    }
}
