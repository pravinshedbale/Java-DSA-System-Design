import java.util.Scanner;

public class LowerBound {

    public static int getLowerBound(int[] arr, int e) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == e) {
                result = mid;
                high = mid - 1;
            } else if (e < arr[mid]) {
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

        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int e;
        e = sc.nextInt();

        System.out.println(getLowerBound(arr, e));
    }
}