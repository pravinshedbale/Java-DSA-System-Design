import java.util.Scanner;

public class LinerSearch {
    public static int linerSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
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
        System.out.print("Key element : ");
        key = sc.nextInt();

        int res = linerSearch(arr, key);

        if (res == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " + res);
        }
    }
}

/*
 * Output
 * 
 * Size of array : 5
 * 5 array elements : 6 2 3 1 7
 * Key element : 5
 * Element not found
 * 
 * Size of array : 5
 * 5 array elements : 6 2 3 1 7
 * Key element : 3
 * Element found at index : 2
 */