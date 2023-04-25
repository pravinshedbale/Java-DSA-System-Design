import java.util.Scanner;

public class PeakElement {

    public static int getPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else if (arr[mid] <= arr[mid + 1]) {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int size, peak = -1;
        Scanner sc = new Scanner(System.in);

        // Input array size
        size = sc.nextInt();

        int[] arr = new int[size];

        // Input array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[getPeak(arr)]);
    }
}

/*
 * Output
 * 5
 * 1 3 2 6 5
 * 6
 * 
 * 7
 * 1 4 7 3 2 6 5
 * 7
 */