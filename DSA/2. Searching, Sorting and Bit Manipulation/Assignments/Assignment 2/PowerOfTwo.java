import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int oneCount = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                oneCount++;
            }
            n = n >> 1;
        }

        if (oneCount == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

/*
 * Output
 * 
 * 15
 * False
 * 
 * 32
 * True
 */