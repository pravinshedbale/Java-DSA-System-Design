# Assignment (OOPs Fundamentals)

### **1. How to create an Object in Java?**

#### In Java object is created using new pointer. The new keyword instantiate a class by allocating memory for new object in heap and returns it reference to that memory. And this reference is stored in a reference variable.

#### Example

```
class Solution {
    public void printData() {
        System.out.println("Data");
    }
}
class Main {
    public static void main(String[] arg) {
        Solution s1 = new Solution(); // In this way object can be created

        /* We can also create reference variable at first step and allocate memory in next step refer
        example below*/

        Solution s2;
        s2 = new Solution();
    }
}
```

<br/>

### **2. What is the use of new keyword in Java?**

- The new keyword in Java is used to instantiate a class by allocating memory for new object.
- It calls the constructor, which instantiate new object

```
Scanner sc = new Scanner(); //Creates the object of Scanner class
```

<br/>

### **3. What is the different types of variables in Java?**

#### Different types of variables in Java are as follows

1. Instance Variable

   - Instance variables are created at the time of object creation and destroyed at the time of object destruction, hence the scope of instance variable is exactly same as the scope of the object.
   - Instance variable will be stored on the heap as a part of the object.
   - Instance variables should be declared within the class directly but outside of any method or block or constructor.

2. Static Variable
   - Variables declared as static.
   - Single copy of variable is created and shared among all objects at class level.
   - Static variables are essentially global variables.
   - All instances of the class share the same static variable.
3. Local Variable
   - Local variables will be stored inside stack.
   - The local variables will be created as a part of block execution in which it is declared and destroyed once that block execution completes. Hence the scope of the local variables is exactly the same as the block in which they are declared.

  <br/>

### **4. What is the difference between instance variable and local variables?**

| **Instance Variable**                                                                                                           | **Local Variable**                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| They are defined in class but outside the body of methods.                                                                      | They are defined as a type of variable declared within programming blocks or subroutines.                                                                      |
| These variables are created when an object is instantiated and are accessible to all constructors, methods, or blocks in class. | These variables are created when a block, method or constructor is started and the variable will be destroyed once it exits the block, method, or constructor. |
| These variables are destroyed when the object is destroyed.                                                                     | These variables are destroyed when the constructor or method is exited.                                                                                        |
| It can be accessed throughout the class.                                                                                        | Its access is limited to the method in which it is declared.                                                                                                   |
| They are used to reserving memory for data that the class needs and that too for the lifetime of the object.                    | They are used to decreasing dependencies between components I.e., the complexity of code is decreased.                                                         |
| These variables are given a default value if it is not assigned by code.                                                        | These variables do not always have some value, so there must be a value assigned by code.                                                                      |
| It is not compulsory to initialize instance variables before use.                                                               | It is important to initialize local variables before use.                                                                                                      |
| It includes access modifiers such as private, public, protected, etc.                                                           | It does not include any access modifiers such as private, public, protected, etc.                                                                              |

<br/>

### **5. In which area memory is allocated for instance variable and local variable?**

#### For instance variable memory is allocated on Heap and for local variable memory is allocated on stack.

<br/>

### **6. What is method overloading ?**

#### Method overloading in java is a feature that allows a class to have more than one method with the same name, but with different parameters.

#### Java supports method overloading through two mechanisms:

1. By changing the number of parameters
2. By changing the data type of parameters Overloading by changing the number of parameters A method can be overloaded by changing the number of parameters.

#### Example

```
public void Square(int number) {
    int square = number * number;
    System.out.println("Method with Integer Argument Called:" + square);
}

public void Square(double number) {
    double square = number * number;
    System.out.println("Method with double Argument Called:" + square);
}

public void Square(long number) {
    long square = number * number;
    System.out.println("Method with long Argument Called:" + square);
}
```
