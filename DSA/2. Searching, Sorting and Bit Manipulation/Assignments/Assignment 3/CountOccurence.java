import java.util.Scanner;

public class CountOccurence {
    public static int getOccurenceCount(int[] arr, int target, boolean startFrom) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                result = mid;
                if (startFrom) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
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

        int target;
        System.out.print("Target element : ");
        target = sc.nextInt();

        // startFrom : true for left, false for right
        int leftOccurence = getOccurenceCount(arr, target, true);
        int rightOccurence = getOccurenceCount(arr, target, false);

        if (leftOccurence == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target " + target + " occurs " + (rightOccurence - leftOccurence + 1) + " times.");
        }
    }
}

/*
 * Output
 * 
 * 10 array elements : 2 5 5 5 6 6 8 9 9 9
 * Target element : 5
 * Target 5 occurs 3 times.
 * 
 * 10 array elements : 2 5 5 5 6 6 8 9 9 9
 * Target element : 6
 * Target 6 occurs 2 times.
 */