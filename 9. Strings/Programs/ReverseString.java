import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println("Original String : " + s);
        System.out.println("Reversed String : " + rev);
        sc.close();
    }
}
