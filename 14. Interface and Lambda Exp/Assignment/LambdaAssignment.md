# Assignment (Lambda Expression)

### **1. What is lambda expression of Java 8?**

#### A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

#### Example : (a, b) -> a + b is a lambda expression (look for that arrow ->).

#### Which is equal to following code:

```
public int value(int a, int b){
return a + b;
}
```

#### It's also called an anonymous function because you are essentially writing the code you write in function but without name.

<br/>

### **2. Can you pass lambda expressions to a methods? when ?**

#### Yes, we can pass a lambda expresion to a method provided it is expecting a functional interface.

#### For example, if a method accepting a Runnable, Comparable then you can pass a lambda expression to it because all these are functional interfaces in Java 8

<br/>

### **3.What is the functional interface in Java 8?**

#### n Interface that contains exactly one abstract method is known as functional interface. It can have any number of default, static methods but can contain only one abstract method. It can also declare methods of object class.

#### Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. It is a new feature in Java, which helps to achieve functional programming approach.

#### Example

```
@FunctionalInterface
interface sayable{
    void say(String msg);
}
public class FunctionalInterfaceExample implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello there");
    }
}
```

#### Output

```
Hello there
```

<br/>

### **4. Why do we use lambda expression in Java?**

#### We use lambda expression in Java for below reasons

1. Enable Funtional Programming : All new JVM based languages take advantages of the functional paradigm in their applications, but programmers forced to work with OOP till lambda expression came. Hence lambda expressions enable us to write functional code.
2. Readable and concise code : People have started using lambda expressions and reported that it can help to remove a large number of lines from their code.
3. Easy-to-Use API and libraries : An API design using lambda expressions can be easier to use and support other API.
4. Enable support for parallel processing : A lambda expression can also enable us to write parallel processing because every processor is a multi-core processor nowadays.

<br/>

### **5. Is it mandatory for a lambda expression to have parameters ?**

#### No, it's not mandatory for a lambda expression to have parameters, you can define a lambda expression

#### without parameters as shown below:

#### () -> System.out.println("lambdas without parameter");

#### You can pass this code to any method which accepts a functional interface.
