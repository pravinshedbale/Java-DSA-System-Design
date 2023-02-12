import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.print("Sorted string : ");
        System.out.println(new String(charArray));
    }
}