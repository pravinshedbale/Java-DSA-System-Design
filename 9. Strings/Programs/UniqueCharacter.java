import java.util.HashMap;
import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        str = sc.nextLine();

        sc.close();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                System.out.println("String does not contains unique characters");
                return;
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println("String contains all unique characters");
    }
}
