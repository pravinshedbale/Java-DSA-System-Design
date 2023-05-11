import java.util.Scanner;

public class PerfectSquare {
    public static boolean isPerfectSquare(int start, int end, int n) {

        int mid = (start + end) / 2;
        if (start > end) {
            return false;
        }
        if (mid * mid == n) {
            return true;
        } else if (mid * mid > n) {
            return isPerfectSquare(start, mid - 1, n);
        } else {
            return isPerfectSquare(mid + 1, end, n);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        System.out.println(isPerfectSquare(1, n, n));
    }
}

/*
 * Output
 * 
 * 16
 * true
 * 
 * 14
 * false
 */