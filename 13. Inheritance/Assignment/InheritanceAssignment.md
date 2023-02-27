# Assignment (Inheritance)

### **1. What is Inheritance in Java?**

1. Inheritance is feature by which one class can aquired properties of another class.
2. It is one of the pillars of object orientation.
3. Speaks about reusability.
4. Using inheritance productivity of application can be increased.
5. Line of code can be reduced.
6. achieved through extends keyword

<br/>

### **2. What is superclass and subclass?**

#### Superclass : A class from where subclass inherits feature is called superclass. Also called as base class or parent class

#### Subclass : A class that inherits properties from another class is called as subclass. Also called as derived class or child class or extended class.

<br/>

### **3. How is inheritance achieved in Java?**

#### Inheritance in Java can be achieve using below methods :

1. Using extends keyword : extends is a keyword used for deriving a class from parent class.
2. Using implements keyword : implements keyword is used for implementing interface in class.

<br/>

### **4. What is polymorphism?**

#### Polymorphism : Polymorphism is the ability to take several forms.

#### It is the ability of an object to take different forms of object.

#### It allows a common data-gathering message to be sent to each class.

#### Polymorphism encourages what is called 'extendibility' which means on object or class can have its used extended.

<br/>

### **5. Difference between method overloading and overriding?**

| No. | Method Overloading                                                                                                                                                                                  | Method Overriding                                                                                                             |
| --- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| 1)  | Method overloading is used *to increase the readability* of the program.                                                                                                                            | Method overriding is used *to provide the specific implementation* of the method that is already provided by its super class. |
| 2)  | Method overloading is performed *within class*.                                                                                                                                                     | Method overriding occurs *in two classes* that have IS-A (inheritance) relationship.                                          |
| 3)  | In case of method overloading, *parameter must be different*.                                                                                                                                       | In case of method overriding, *parameter must be same*.                                                                       |
| 4)  | Method overloading is the example of *compile time polymorphism*.                                                                                                                                   | Method overriding is the example of *run time polymorphism*.                                                                  |
| 5)  | In java, method overloading can't be performed by changing return type of the method only. *Return type can be same or different* in method overloading. But you must have to change the parameter. | *Return type must be same or covariant* in method overriding.                                                                 |

<br/>

### **6. What is an abstraction explain with example**

#### Data abstraction is the process of hiding certain details and showing only essential information to the user.Abstraction can be achieved with either abstract classes or interfaces.

```
abstract class Animal {
  public abstract void animalSound();
}
```

<br/>

### **7. What is the differene between abstract method and final method in java? explain with an exmaple**

#### Abstract Method

1. An abstract method is a method that is declared without an implementation.
2. It can be implemented/overriden in child class.

#### Final Method

1. A final method cannot be overridden.
2. We must declare methods with final keyword for which we required to follow the same implementation throughout all the derived classes.

#### Example

```
abstract class Animal {
    abstract void sound();
    final boolean isLiving() {
        return true
    }
}
```

#### In above example we can implement sound() method in child class but we cannot override isLiving() method at any situation in child classes.

<br/>

### **8. What is final class in Java**

#### Final Class in Java uses the final keyword for its declaration. The final keyword in java is used to restrict the user, similarly, the final class means that the class cannot be extended. We can only create a final class if it is complete in nature, which means it cannot be an abstract class. All wrapper classes in Java are final classes, such as String, Integer, etc. Final class cannot be inherited by any subclass,

#### Example

```
final class className
{
    // Body of class
}

```

<br/>

### **9. Difference between abstraction and encapsulation**

| Abstraction                                                                                   | Encapsulation                                                                                                                          |
| --------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| Abstraction is the process or method of gaining the information.                              | While encapsulation is the process or method to contain the information.                                                               |
| In abstraction, problems are solved at the design or interface level.                         | While in encapsulation, problems are solved at the implementation level.                                                               |
| Abstraction is the method of hiding the unwanted information.                                 | Whereas encapsulation is a method to hide the data in a single entity or unit along with a method to protect information from outside. |
| We can implement abstraction using abstract class and interfaces.                             | Whereas encapsulation can be implemented using by access modifier i.e. private, protected and public.                                  |
| In abstraction, implementation complexities are hidden using abstract classes and interfaces. | While in encapsulation, the data is hidden using methods of getters and setters.                                                       |
| The objects that help to perform abstraction are encapsulated.                                | Whereas the objects that result in encapsulation need not be abstracted.                                                               |
| Abstraction provides access to specific part of data.                                         | Encapsulation hides data and the user can not access same directly (data hiding.                                                       |
| Abstraction focus is on “what” should be done.                                                | Encapsulation focus is on “How” it should be done.                                                                                     |

<br/>

### **10. Difference between runtime and compile time polymorphism explain with an example**

| Compile Time Polymorphism                                                                                                                                             | Run time Polymorphism                                                                                                                                  |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| In Compile time Polymorphism, the call is resolved by the compiler.                                                                                                   | In Run time Polymorphism, the call is not resolved by the compiler.                                                                                    |
| It is also known as Static binding, Early binding and overloading as well.                                                                                            | It is also known as Dynamic binding, Late binding and overriding as well.                                                                              |
| Method overloading is the compile-time polymorphism where more than one methods share the same name with different parameters or signature and different return type. | Method overriding is the runtime polymorphism having the same method with same parameters or signature but associated withcompared, different classes. |
| It is achieved by function overloading and operator overloading.                                                                                                      | It is achieved by virtual functions and pointers.                                                                                                      |
| It provides fast execution because the method that needs to be executed is known early at the compile time.                                                           | It provides slow execution as compare to early binding because the method that needs to be executed is known at the runtime.                           |
| Compile time polymorphism is less flexible as all things execute at compile time.                                                                                     | Run time polymorphism is more flexible as all things execute at run time.                                                                              |
| Inheritance is not involved.                                                                                                                                          | Inheritance is involved.                                                                                                                               |

#### Example

```
// Java program to demonstrate
// compile-time polymorphism
public class Demo {

	// First addition function
	public static int add(int a, int b)
	{
		return a + b;
	}

	// Second addition function
	public static double add(
		double a, double b)
	{
		return a + b;
	}

	// Driver code
	public static void main(String args[])
	{
		// Here, the first addition
		// function is called
		System.out.println(add(2, 3));

		// Here, the second addition
		// function is called
		System.out.println(add(2.0, 3.0));
	}
}

```

#### Output

```
5
5.0
```

```
// Java program to demonstrate
// runtime polymorphism

// Implementing a class
class Test {

	// Implementing a method
	public void method()
	{
		System.out.println("Method 1");
	}
}

// Defining a child class
public class Demo extends Test {

	// Overriding the parent method
	public void method()
	{
		System.out.println("Method 2");
	}

	// Driver code
	public static void main(String args[])
	{
		Test test = new Demo();

		test.method();
	}
}

```

#### Output

```
Method 2
```
