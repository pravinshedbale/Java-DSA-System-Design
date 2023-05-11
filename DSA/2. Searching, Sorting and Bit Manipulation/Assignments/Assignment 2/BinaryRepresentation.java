import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int length = 0;
        int[] binForm = new int[50];

        while (n > 0) {
            binForm[length++] = n % 2;
            n /= 2;
        }

        for (int i = length - 1; i >= 0; i--) {
            System.out.print(binForm[i]);
        }
        System.out.println();
    }
}

/*
 * Output
 * 5
 * 101
 * 
 * 10
 * 1010
 */