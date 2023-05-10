import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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

        // call insertionSort function
        insertionSort(arr);

        // Array after sort
        System.out.println("Array after sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/* Output
5
3 5 1 6 0
Array before sort
3 5 1 6 0 
Array after sort
6 5 3 1 0 
*/