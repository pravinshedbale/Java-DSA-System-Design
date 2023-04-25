import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        int size, largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        boolean secondLargestExist = false;
        Scanner sc = new Scanner(System.in);

        // Input array size
        size = sc.nextInt();

        int[] arr = new int[size];

        // Input array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int e : arr) {
            if (e > largest)
                largest = e;
        }

        for (int e : arr) {
            if (e > secondLargest && e < largest && (secondLargestExist = true))
                secondLargest = e;
        }

        System.out.println(secondLargestExist ? secondLargest : largest);
    }
}

/*
 * Output
 * 5
 * 34 21 54 65 43
 * 54
 * 
 * 5
 * 4 3 6 7 1
 * 6
 */
