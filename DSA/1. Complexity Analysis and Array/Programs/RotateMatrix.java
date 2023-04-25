import java.util.Scanner;

public class RotateMatrix {

    public static void rotateMatrix(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < m; i++) {
            int rIndex = n - 1;
            int lIndex = 0;

            while (lIndex < rIndex) {
                int temp = arr[i][lIndex];
                arr[i][lIndex] = arr[i][rIndex];
                arr[i][rIndex] = temp;
                rIndex--;
                lIndex++;
            }
        }

    }

    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] arr = new int[m][n];

        // Input Matrix / 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix before rotate");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        rotateMatrix(arr, m, n);

        System.out.println(arr.toString());
        System.out.println("Matrix after Rotate");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}