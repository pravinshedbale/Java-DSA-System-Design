import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if ((n & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}

/*
 * Output
 * 
 * 8
 * Even
 * 
 * 3
 * Odd
 */