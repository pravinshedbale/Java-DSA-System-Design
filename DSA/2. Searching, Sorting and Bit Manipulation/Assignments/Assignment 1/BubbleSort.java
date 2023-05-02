import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        // Input array size;
        n = sc.nextInt();

        // Declare n size array
        int[] arr = new int[n];

        // Input n sized array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Array before sort
        System.out.println("Array before sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // call bubblesort function
        bubbleSort(arr);

        // Array after sort
        System.out.println("Array after sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Output
 * 5
 * 4 1 3 2 5
 * Array before sort
 * 4 1 3 2 5
 * Array after sort
 * 5 4 3 2 1
 */
