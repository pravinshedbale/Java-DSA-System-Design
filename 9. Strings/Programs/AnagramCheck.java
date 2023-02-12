import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1 : ");
        str1 = sc.nextLine();

        System.out.print("Enter String 2 : ");
        str2 = sc.nextLine();

        sc.close();

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        if (str1Arr.length != str2Arr.length) {
            System.out.println("Entered strings are not anagram");
            return;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1Arr[i] != str2Arr[i]) {
                    System.out.println("Entered strings are not anagram");
                    return;
                }
            }
        }
        System.out.println("Entered strings are anagram");

    }
}
