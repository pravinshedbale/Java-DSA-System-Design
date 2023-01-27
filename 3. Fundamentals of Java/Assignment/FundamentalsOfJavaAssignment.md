# Assignment (Fundamentals of Java I)

### **1. What is a programming language?**

#### A programming language is a computer language that is used by programmers/developers to communicate with computers. It is a set of instructions written in any specific language ( C, C++, Java, Python) to perform a specific task.

<br/>

### **2. Why do we need programming language?**

#### We cannot communicate with computers directly, computers only understand binary language and it is very hard to write binary instructions. Thus we need programming language to instruct computers. Programming language works as middleware between developer and processor.

<br/>

### **3. What are the features of Java ?**

#### Features of Java are as follow

- Simple
- Object-Oriented
- Portable
- Platform Independent
- Secure
- Robust
- Architecture neutral
- Intrepreted
- High Performance
- Multithreaded
- Distributed
- Dynamic

  <br/>

### **4. What is an object ?**

#### Objects are conceptually similar to real-world objects: they too consist of state and related behavior. An object stores its state in fields (variables in some programming languages) and exposes its behavior through methods (functions in some programming languages)

<br/>

### **5. What is class ?**

#### A class is the blueprint from which individual objects are created.

<br/>

### **6 Explain about main method in Java**

#### The main() is the starting point for JVM to start execution of a Java program. Without the main() method, JVM will not execute the program. The syntax of the main() method is:

- public: It is an access specifier. We should use a public keyword before the main() method so that JVM can identify the execution point of the program. If we use private, protected, and default before the main() method, it will not be visible to JVM.
- static: You can make a method static by using the keyword static. We should call the main() method without creating an object. Static methods are the method which invokes without creating the objects, so we do not need any object to call the main() method.
- void: In Java, every method has the return type. Void keyword acknowledges the compiler that main() method does not return any value.
- main(): It is a default signature which is predefined in the JVM. It is called by JVM to execute a program line by line and end the execution after completion of this method. We can also overload the main() method.
- String args[]: The main() method also accepts some data from the user. It accepts a group of strings, which is called a string array. It is used to hold the command line arguments in the form of string values.

#### Example

```
class Pravin {
    public static void main(String[] arg) {
        System.out.println("Hello World");
    }
}
```
