import java.util.Scanner;

public class MaximumElementInArray {
    public static void main(String[] args) {
        int size, max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        // Input array size
        size = sc.nextInt();

        int[] arr = new int[size];

        // Input array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int e : arr) {
            if (e > max)
                max = e;
        }
        System.out.println(max);
    }
}

/*
 * Output
 * 5
 * 34 21 54 65 43
 * 65
 */