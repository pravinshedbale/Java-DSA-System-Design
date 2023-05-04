import java.util.Scanner;

public class MaxValueOfArray {
    public static int getMaxFromArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int max = arr[index] > arr[index + 1] ? arr[index] : arr[index + 1];
        arr[index + 1] = max;
        return getMaxFromArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getMaxFromArray(arr, 0));
    }
}

/*
 * Output
 * 5
 * 13 1 -3 22 5
 * 22
 */