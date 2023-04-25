import java.util.Scanner;

public class PrintEvenFromArray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);

        // Input array size
        size = sc.nextInt();

        int[] arr = new int[size];

        // Input array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int e : arr) {
            if (e % 2 == 0) {
                System.out.println(e);
            }
        }
    }
}
/*
 * Output
 * 5
 * 34 21 54 65 43
 * 34
 * 54
 */