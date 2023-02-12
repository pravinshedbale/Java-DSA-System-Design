import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        str += sc.nextLine();
        String strrev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strrev += str.charAt(i);
        }
        if (str.equals(strrev)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
        sc.close();
    }
}
