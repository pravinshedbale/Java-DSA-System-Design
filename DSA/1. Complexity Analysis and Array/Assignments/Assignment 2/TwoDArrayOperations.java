import java.util.Scanner;

public class TwoDArrayOperations {
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

        int numberOfPositiveNumbers = 0;
        int numberOfNegativeNumbers = 0;
        int numberOfOddNumbers = 0;
        int numberOfEvenNumbers = 0;
        int numberOfZeros = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > 0) {
                    numberOfPositiveNumbers++;
                }
                if (arr[i][j] < 0) {
                    numberOfNegativeNumbers++;
                }
                if (arr[i][j] % 2 != 0) {
                    numberOfOddNumbers++;
                }
                if (arr[i][j] % 2 == 0) {
                    numberOfEvenNumbers++;
                }
                if (arr[i][j] == 0) {
                    numberOfZeros++;
                }
            }
        }

        System.out.println("Number of positive numbers : " + numberOfPositiveNumbers);
        System.out.println("Number of negative numbers : " + numberOfNegativeNumbers);
        System.out.println("Number of odd numbers : " + numberOfOddNumbers);
        System.out.println("Number of even numbers : " + numberOfEvenNumbers);
        System.out.println("Number of 0 : " + numberOfZeros);
    }
}

/*
 * Output
 * 
 * 4 4
 * 1 2 -3 4
 * 0 0 -4 2
 * 1 -1 2 3
 * -4 -5 -7 0
 * Number of positive numbers : 7
 * Number of negative numbers : 6
 * Number of odd numbers : 7
 * Number of even numbers : 9
 * Number of 0 : 3
 */