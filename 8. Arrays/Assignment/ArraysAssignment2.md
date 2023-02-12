# Assignment (Arrays in Java II)

### **1. What is the default value of Array for different data type?**

1.  boolean - false
2.  int - 0
3.  double - 0.0
4.  String - null
5.  User defined data type - null

<br/>

### **2. Can you pass the negative number in array size?**

#### No, we cannot pass negative number in array size. Array size must have positive length

<br/>

### **3. Where does array stored in JVM memory?**

#### Array is store in Heap in the JVM memory.As arrays are also reference types, (they can be created using the “new” keyword) they are also stored in the Heap area

<br/>

### **4. What are the disadvantages of Array ?**

1. The size of the array should be known in advance.
2. The array is a static data structure with a fixed size so, the size of the array cannot be modified further and hence no modification can be done during runtime.
3. Insertion and deletion operations are costly in arrays as elements are stored in contiguous memory.
4. If the size of the declared array is more than the required size then, it can lead to memory wastage.
5. Resizing an array can be time-consuming, especially if it needs to be done frequently. This can be especially problematic for large arrays.
6. No built-in functionality.
7. Arrays do not come with built-in security features, making them vulnerable to certain types of attacks.

<br/>

### **5. What is Anonymous array in Java? Give example**

#### An array in Java without any name is known as an anonymous array. It is an array just for creating and using instantly. Using an anonymous array, we can pass an array with user values without the referenced variable.

```
// Java program to illustrate the
// concept of anonymous array

class Test {
    public static void main(String[] args) {
        // anonymous array
        sum(new int[]{ 1, 2, 3 });
    }

    public static void sum(int[] a) {
        int total = 0;
        for (int i : a)
            total = total + i;
        System.out.println("The sum is: " + total);
    }
}
```

#### Output

```
6
```

<br/>

### **6. What are the different ways to traverse array in Java?**

#### We can traverse through array in Java using for loop or enhanced for loop

```
public class ArrayDemo {
    public static void main(String[] arg) {
        int[] arr = {1,2,3,4,5};

        //traversing using for loop
        System.out.println("Traversing using for loop");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //traversing using enhanced for loop
        System.out.println("Traversing using enahanced for loop");
        for(int n: arr) {
            System.out.print(n+" ");
        }
    }
}
```

#### Output

```
Traversing using for loop
1 2 3 4 5 6 7 8 9

Traversing using for enhanced loop
1 2 3 4 5 6 7 8 9
```

 <br/>

### **7. What is the difference between length and length() method give an example?**

#### length is the property of Java array to get its length whereas length() is the function from String class to get length of String

```
public class Demo {
    public static void main(String[] arg) {
        int[] arr = new int[10];
        String name = "Pravin";
        System.out.println("Length of array is : "+arr.length);
        System.out.println("Length of string is : "+name.length());
    }
}
```

#### Output

```
Length of array is : 10
Length of string is : 6
```
