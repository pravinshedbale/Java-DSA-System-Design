import java.util.Scanner;

public class LastOccurence {
    public static int getLastOccurence(int[] arr, int key) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print(n + " array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key;
        System.out.print("Target element : ");
        key = sc.nextInt();

        System.out.println(getLastOccurence(arr, key));

    }
}

/*
 * Output
 * 
 * Size of array : 12
 * 12 array elements : 1 1 1 2 3 4 4 5 6 6 6 6
 * Target element : 4
 * 6
 * 
 * Size of array : 10
 * 10 array elements : 2 2 2 6 6 18 9 30 30 30
 * Target element : 15
 * -1
 */
