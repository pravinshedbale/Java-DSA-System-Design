import java.util.HashMap;
import java.util.Scanner;

public class PrintDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String string = new String(sc.nextLine());
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : string.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println("Duplicate characters from string are as follows : ");
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                continue;
            }
            System.out.println(ch);
        }
        sc.close();
    }
}
