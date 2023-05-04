import java.util.Scanner;

public class ArmstrongNumber {
    public static double getPoweredSum(int n, int l) {
        if (n == 0)
            return 0;
        return Math.pow(n % 10, l) + getPoweredSum(n / 10, l);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if (n == getPoweredSum(n, Integer.toString(n).length())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
/*
 * Output
 * 
 * 153
 * Yes
 * 
 * 134
 * No
 */
