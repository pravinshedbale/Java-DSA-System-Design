import java.util.Scanner;

public class ReverseWordOrder {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        str += sc.nextLine();
        System.out.println("Original String : ");
        System.out.println(str);
        String[] words = str.split(" ");
        System.out.println("String after reversing word order : ");
        String output = "";
        for (int i = words.length - 1; i >= 0; i--) {
            output += " " + words[i];
        }
        System.out.println(output);
        sc.close();
    }
}
