import java.util.Scanner;

public class ElementsAboveSecondaryDiagonal {
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        int[][] arr = new int[m][m];

        // Input Array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print elements above seconday diagonal
        System.out.println("--------Elements above secondary diagonal-----------");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) < m - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
/*
 * Output
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * --------Elements above secondary diagonal-----------
 * 1 2 4
 */
