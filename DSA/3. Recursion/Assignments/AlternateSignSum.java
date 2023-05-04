import java.util.Scanner;

public class AlternateSignSum {
    public static int getAlternateSignSum(int n) {
        if (n == 1)
            return n;
        if (n % 2 == 0) {
            return -n + getAlternateSignSum(n - 1);
        } else {
            return n + getAlternateSignSum(n - 1);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        System.out.println(getAlternateSignSum(n));
    }
}

/*
 * Output
 * 10
 * -5
 * 
 * 5
 * 3
 */