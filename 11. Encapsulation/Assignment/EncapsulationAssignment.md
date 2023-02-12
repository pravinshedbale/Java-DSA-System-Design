# Assignment (Encapsulation)

### **1. What is encapsulation in Java ? Why s it called data hiding?**

#### Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, that it is a protective shield that prevents the data from being accessed by the code outside this shield.

<p>

#### In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

<br/>

### **2. What are the important features of encapsulation?**

#### Features of encapsulation

1. As all the related fields/variables and methods are bundled together, it makes complex code look cleaner and more organized and reduces complexity in managing the code.
2. It improves the flexibility of the code. Since all the units are decoupled, we can modify a unit independently without changing any other unit.
3. As data encapsulation helps to establish data hiding and prevents unauthorized data access, it makes the code more secure.
4. The variables/fields can be made Read-Only (if setter methods are not defined) or Write-Only (if getter methods are not defined)
5. Data encapsulation makes code units (classes, for example) more flexible, as the code can be maintained at any point without breaking the classes that use the code.

<br/>

### **3. What are getter and setter methods in Java exmplain with an example**

#### Getter Methods : The getter method returns the value of the attribute.

#### Setter Methods : The setter method takes a parameter and assigns it to the attribute.

#### Example

```
class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class GetterAndSetterDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Pravin");
        s1.setAge(24);

        System.out.println("Student Name : " + s1.getName());
        System.out.println("Student Age : " + s1.getAge());
    }
}
```

#### Output

```
Student Name : Pravin
Student Age : 24
```

<br/>

### **4. What is the use of this keyword explain with an example?**

#### The this keyword refers to the current object in a method or constructor.

<p>

#### The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).

```
public class Main {
  int x;
  public Main(int x) {
    this.x = x; //use of this keyword
  }
  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println("Value of x = " + myObj.x);
  }
}
```

#### Output

```
Value of x = 5
```

<br/>

### **5. What is the advantage of Encapsulation**

#### Advantages of Encapsulation are as follow

1. Protect Your Data

   With encapsulation, you can keep your data and codes safe from external inheritance. For example, if any program runner tries to change the program, they can only interact with the getter and setter methods of the program. They will not have any idea to change any specific variable or data and hinder the running of the program resulting in high security.

2. Easy to Test code

   The code which is encapsulated is simple to debug and easy to test for unit testing.

3. Flexible

   The encapsulated code is cleaner, flexible, and easy to change as per our needs. It means we can change the code read-only or write-only by getter and setter methods.

   For example, if you don’t define the setter method in the class then the fields can be made read-only whereas if you don’t define the getter method in the class then the fields can be made write-only.

4. Easy to Reuse

   Encapsulation enables you to easily change the methods, reuse the code, and execute new requirements in your program.

<br/>

### **6. How to achieve encapsulation in Java? Give an example**

#### Encapsulation in Java can be achieved by:

1. Declaring the variables of a class as private.
2. Providing public setter and getter methods to modify and view the variables values.

#### Example

```
class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Pravin");
        s1.setAge(24);

        System.out.println("Student Name : " + s1.getName());
        System.out.println("Student Age : " + s1.getAge());
    }
}
```

#### Output

```
Student Name : Pravin
Student Age : 24
```
