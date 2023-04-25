import java.util.Scanner;

public class MiddleRowAndCol {

    public static void printMiddleRowAndCol(int[][] arr, int row, int col) {
        int middleRowNum = row / 2;
        int middleColNum = col / 2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == middleRowNum || j == middleColNum) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

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
        System.out.println("----------Middle row of given 2D array is----------");
        printMiddleRowAndCol(arr, m, n);
        System.out.println();
    }
}

/*
 * Output
 * 
 * 5 5
 * 1 2 3 4 5
 * 3 4 5 6 7
 * 7 6 5 4 3
 * 8 7 6 5 4
 * 1 2 37 8 0
 * ----------Middle row of given 2D array is----------
 * 3 5 7 6 5 4 3 6 37
 */