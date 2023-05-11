import java.util.Scanner;

public class OddOccuringElement {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int oddOccuringElement = 0;

        for (int i = 0; i < n; i++) {
            oddOccuringElement = oddOccuringElement ^ arr[i];
        }

        System.out.println("Odd occuring element in array is : " + oddOccuringElement);
    }
}

/*
 * Output
 * 11
 * 4 3 6 2 6 4 2 3 4 3 3
 * Odd occuring element in array is : 4
 */