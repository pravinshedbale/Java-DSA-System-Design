import java.util.Scanner;

public class PangramCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String:");
        String str = sc.nextLine();

        sc.close();

        str = str.replaceAll("", "").toLowerCase();

        String s = "";
        for (char i = 'a'; i <= 'z'; i++) {
            if (str.indexOf(i) != -1) {
                s = s + i;
            }
        }
        if (s.length() == 26) {
            System.out.println("Entered string is pangram");
        } else {
            System.out.println("Entered string is not pangram");
        }
    }
}