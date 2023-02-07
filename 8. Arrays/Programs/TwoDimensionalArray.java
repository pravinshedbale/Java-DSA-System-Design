import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;

        // Accepting Rows and Cols
        System.out.print("Enter Number of Rows and Cols for 2D Array : ");

        row = sc.nextInt();
        col = sc.nextInt();

        // Creating 2d array
        int[][] array = new int[row][col];

        // Accepting array elements
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Printing the array
        System.out.println("Entered Array is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
