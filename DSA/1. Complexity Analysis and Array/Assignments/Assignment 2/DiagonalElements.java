import java.util.Scanner;

public class DiagonalElements {
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

        System.out.println("-----------Diagonal elements in given matric are-------------");
        // Print diagonal elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == j) || ((i + j) == (m - 1))) {
                    System.out.print(arr[i][j] + "");
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
 * -----------Diagonal elements in given matric are-------------
 * 13579
 */