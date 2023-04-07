import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add("Pravin");
        System.out.println(list);

        ArrayList list2 = new ArrayList<>();
        list2.addAll(list);

        System.out.println(list2);

    }
}
