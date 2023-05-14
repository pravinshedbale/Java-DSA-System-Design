import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllSequences {
    public static void printSequence(int[] arr, int index, ArrayList<Integer> tempArr) {
        // Base case
        if (index == arr.length) {
            // print the subsequences other than empty entries
            if (tempArr.size() > 0) {
                System.out.println(tempArr);
            }
            return;
        }

        // Recursive call

        // include current
        printSequence(arr, index + 1, tempArr);
        tempArr.add(arr[index]);

        // exclude current
        printSequence(arr, index + 1, tempArr);
        tempArr.remove(tempArr.size() - 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printSequence(arr, 0, new ArrayList<Integer>());

        sc.close();
    }
}
