import java.util.Scanner;

public class ReverseWordWithoutReversingOrder {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        str += sc.nextLine();
        sc.close();

        StringBuilder ans = new StringBuilder();

        for (String s : str.split(" ")) {
            StringBuilder word = new StringBuilder(s);
            ans.append(word.reverse() + " ");
        }

        System.out.println(ans);
    }
}