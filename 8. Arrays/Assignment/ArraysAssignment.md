# Assignment (Arrays in Java)

### **1. What do you mean by a array?**

1. An array is a container object that holds a fixed number of values of a single type
2. The length of an array is established when the array is created

<br/>

### **2. How to create an Array?**

#### One way to create an array is with the new operator. The below statement allocates an array with enough memory for 10 integer elements and assigns the array to the anArray variable.

```
// create an array of integers
int[] anArray = new int[10];
```

<br/>

### **3. Can we change the size of an Array at runtime?**

#### No, We cannot change the size of an Array at runtime.

<br/>

### **4. Can you declare an array without assigning the size of an array?**

#### Yes. We can declare an array without size but before using it needs to be initialized.

```
int[] myarray = {1,2,3,4,5};
```

<br/>

### **5. What is the default value of Array**

#### Java will assign the default value 0 to each element of the array in the case of an int array.

```
public class Example1 {
    public static void main( String args[] ) {
        int[] num= new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
    }
}
```

#### Output

```
0
0
0
0
0
```

<br/>

### **6. What is a 1D Array with an example?**

#### A one-dimensional array in Java is a collection of similar types of elements stored at contiguous memory locations. The data is stored in a continuous manner, which makes operations like search, delete, insert etc., much easier.

#### In other words One-dimensional array in Java programming is an array with a bunch of values having been declared with a single index.

#### Example

```
public class Example1 {
    public static void main( String args[] ) {
        int[] num= new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
    }
}
```

#### Output

```
1
2
3
4
5
```

 <br/>

### **7. Write a program on 2D Array?**

```
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;

        // Accepting Rows and Cols
        System.out.print("Enter Number of Rows and Cols for 2D Array : ");

        row = sc.nextInt();
        col = sc.nextInt();

        // Creating 2d array
        int[][] array = new int[row][col];

        // Accepting array elements
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Printing the array
        System.out.println("Entered Array is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

#### Output

```
Enter Number of Rows and Cols for 2D Array : 3 3
Enter Array Elements :
1 1 1
2 2 2
3 3 3
Entered Array is :
1 1 1
2 2 2
3 3 3
```
