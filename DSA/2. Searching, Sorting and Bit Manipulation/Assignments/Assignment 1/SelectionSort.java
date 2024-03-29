import java.util.Scanner;
public class SelectionSort {
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] > arr[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        // Input array size;
        n = sc.nextInt();

        // Declare n size array
        int[] arr = new int[n];

        // Input n sized array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Array before sort
        System.out.println("Array before sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // call selectionSort function
        selectionSort(arr);

        // Array after sort
        System.out.println("Array after sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/* Output
5
3 5 1 6 0
Array before sort
3 5 1 6 0 
Array after sort
6 5 3 1 0 
*/