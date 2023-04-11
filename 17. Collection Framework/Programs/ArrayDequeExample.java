import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque<>();
        ad.add(100);
        ad.add(200);
        ad.addFirst(10);
        System.out.println(ad);
    }
}
