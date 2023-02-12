# Assignment (Constructor)

### **1. What is a constructor?**

#### A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.

<br/>

### **2. What is constructor chaining?**

#### Constructor chaining is the process of calling a sequence of constructors. We can do it in two ways:

1. by using this() keyword for chaining constructors in the same class
2. by using super() keyword for chaining constructors from the parent class

<br/>

### **3. Can we call a subclass constructor from a superclass constructor?**

#### We cannot call subclass constructor from a superclass constructor, however reverse is possible.

<br/>

### **4. What happens if you keep a return type for a constructor?**

#### If we add a return type to a constructor, then it will become a method of the class.

<br/>

### **5. What is no-arg constructor?**

1. As a developer we can create our own constructor with no arguments is known as no-argument constructor.
2. It can have all four accessibility modifiers as it is defined by developer.
3. So allowed accessibility modifiers are public, private, protected and default
4. It can have logic including super call.

```
class Constructor {
    public Constructor() {
        super();
    }
}
```

<br/>

### **6. How is no-argument constructor different from the default constructor**

1. The default constructor is added by the compiler when the programmer doesn’t explicitly add a constructor in the class.
2. This is how a default constructor looks like

```
class Car {
    public Car() {
        // the default constructor would not have any code in it.
    }
}
```

3. A no-arg constructor could be added by the programmer that might be initialising the instance variables. In case you have added a constructor(any parameterised or no-arg) in the class then the compiler will not add the default constructor. This is how your no-arg constructor might look like

```
public class Car{
    private int speed;
    private int height;
    public Car(){
        speed=56; // instance variables initialized.
        height=70;
    }
}
```

<br/>

### **7. When do we need constructor overloading**

#### Constructor overloading needed because of below

1. The constructor overloading enables the accomplishment of static polymorphism.
2. The class instances can be initialized in several ways with the use of constructor overloading.
3. It facilitates the process of defining multiple constructors in a class with unique signatures.
4. Each overloaded constructor performs various tasks for specified purposes.

<br/>

### **7. What is default constructor explain with example**

#### A constructor is called "Default Constructor" when it doesn't have any parameter.

#### Example

```
class Student {
    String name;
    public Student() {
        name = "Pravin";
    }
    public void printData() {
        System.out.println("Name of Student : "+name);
    }
}

public class DefaultConstructorDemo {
    public static void main(String[] arg) {
        Student s1 = new Student();
        s1.printData();
    }
}
```

#### Output

```
Name of Student : Pravin
```
