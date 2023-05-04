import java.util.Scanner;

public class SumOfArray {
    public static int getArraySum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return arr[index] + getArraySum(arr, index + 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getArraySum(arr, 0));
    }
}

/*
 * Output
 * 5
 * 92 23 15 -20 10
 * 120
 */