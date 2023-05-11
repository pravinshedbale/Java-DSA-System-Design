import java.util.Scanner;

public class CountOnes {
    public static int getOnesCount(int[] arr) {
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                count++;
            } else {
                break;
            }
        }
        return count;
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
        System.out.println("Number of 1's : " + getOnesCount(arr));
    }
}

/*
 * Output
 * 
 * Size of array : 10
 * 10 array elements : 0 0 0 0 1 1 1 1 1 1
 * Number of 1's : 6
 * 
 * Size of array : 7
 * 7 array elements : 0 0 0 0 0 1 1
 * Number of 1's : 2
 */