import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String string = new String(sc.nextLine());
        String output = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : string.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char ch : string.toCharArray()) {
            if (map.get(ch) > 1) {
                continue;
            }
            output += ch;
        }
        System.out.println("String after removing duplicate : " + output);
        sc.close();
    }
}
