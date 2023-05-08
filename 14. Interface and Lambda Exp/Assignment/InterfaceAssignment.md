# Assignment (Inheritance)

### **1. What is Interface in Java?**

#### An interface in Java is a mechanism that is used to achieve complete abstraction. It is basically a kind of class that contains only constant and abstract methods.

<br/>

### **2. Which modifiers are allowed for methods in an interface? Explain with an exmaple**

#### Abstract and public modifiers are allowed for methods in an interface.

```
interface Animal {
    public void sleep();
    abstract void eat();
}
```

<br/>

### **3. What is the use of interface in Java?**

#### Uses of interface are as below :

1. An interface is used to achieve full abstraction.
2. Using interface is the best way to expose our project's API to some other project.
3. Programmers use interfaces to customize features of software diffrerently for different objects.
4. By using interface, we can achieve the functionality of multiple inheritance.

<br/>

### **4. What is the difference between abstract class and interface in Java?**

#### Difference between abstract class and interface is as follows

| Abstract class                                                                             | Interface                                                                                            |
| ------------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------------------------------- |
| 1) Abstract class can have abstract and non-abstract methods.                              | Interface can have only abstract methods. Since Java 8, it can have default and static methods also. |
| 2) Abstract class doesn't support multiple inheritance.                                    | Interface supports multiple inheritance.                                                             |
| 3) Abstract class can have final, non-final, static and non-static variables.              | Interface has only static and final variables.                                                       |
| 4) Abstract class can provide the implementation of interface.                             | Interface can't provide the implementation of abstract class.                                        |
| 5) The abstract keyword is used to declare abstract class.                                 | The interface keyword is used to declare interface.                                                  |
| 6) An abstract class can extend another Java class and implement multiple Java interfaces. | An interface can extend another Java interface only.                                                 |
| 7) An abstract class can be extended using keyword "extends".                              | An interface can be implemented using keyword "implements".                                          |
| 8) A Java abstract class can have class members like private, protected, etc.              | Members of a Java interface are public by default.                                                   |
| 9)Example:<br>public abstract class Shape{<br>public abstract void draw();<br>}            | Example:<br>public interface Drawable{<br>void draw();<br>}                                          |
