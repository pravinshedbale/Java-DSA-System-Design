import java.util.Scanner;

public class LargestElementIn2DArray {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] arr = new int[m][n];

        // Input Array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int largestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > largestNumber) {
                    largestNumber = arr[i][j];
                }
            }
        }

        System.out.println("Largest number in given 2D array is : " + largestNumber);
    }
}

/*
 * Output
 * 
 * 3 4
 * 1 2 4 0
 * 2 5 7 -1
 * 4 2 6 9
 * Largest number in given 2D array is : 9
 */
