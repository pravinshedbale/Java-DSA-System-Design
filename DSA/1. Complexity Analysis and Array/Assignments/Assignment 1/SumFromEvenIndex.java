import java.util.Scanner;

public class SumFromEvenIndex {
    public static void main(String[] args) {
        int size, sum = 0;
        Scanner sc = new Scanner(System.in);

        // Input array size
        size = sc.nextInt();

        int[] arr = new int[size];

        // Input array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum at even index
        for (int i = 0; i < size; i += 2) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}

/*
 * Output
 * 5
 * 3 20 4 6 9
 * 16
 */
