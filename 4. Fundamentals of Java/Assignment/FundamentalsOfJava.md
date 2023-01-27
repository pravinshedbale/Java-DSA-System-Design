# Assignment (Fundamentals of Java II)

### **1. What is statically and dynamically typed programming language?**

### Statically Typed Language: In Static Typing, type checking is performed during compile time. It means that the type of a variable is known at compile time. For some languages, the programmer must specify what type each variable is (e.g C, C++, Java), other languages offer some form of type inference(e.g. Scala, Haskell).

```
String a;
a = "Java is good";
```

#### Dynamically Typed Language : In Dynamic Typing, type checking is performed at runtime. For example, Python is a dynamically typed language. It means that the type of a variable is allowed to change over its lifetime. Other dynamically typed languages are -Perl, Ruby, PHP, Javascript etc.

```
## variable a is assigned to a string

a ="hello"
print(type(a))

## variable a is assigned to an integer

a = 5
print(type(a))
```

<br/>

### **2. What is the variable in java?**

#### Variable in the label to the memory storage block which allows us to store and retrieve value/data efficiently. It is also called as data container.

```
int marks = 10; //Value 10 is stored in a variable called 'marks'
String name = "Pravin"; //Value "Pravin" is stored in a variable called 'name'
```

<br/>

### **3. How to assign value to variable?**

#### Values can be assigned to the variable using assignment operator "="

```
//Example
String name = "Pravin";
```

  <br/>

### **4. What are primitive data types in Java ?**

#### A primitive data type is either a data type that is built into a programming language, or one that could be characterized as a basic structure for building more sophisticated data types.

#### Primitive data types in java are as follows :

- byte
- short
- int
- long
- float
- double
- boolean
- char

<br/>

### **5. What are the identifiers in Java ?**

#### Identifiers in Java are symbolic names used for identification. They can be a class name, variable name, method name, package name, constant name, and more. However, In Java, There are some reserved words that can not be used as an identifier.

```
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello PW");
    }
}
```

#### From the above example, we have the following Java identifiers:

- Hello (Class name)
- main (main method)
- String (Predefined Class name)
- args (String variables)
- System (Predefined class)
- out (Variable name)
- println (method)

<br/>

### **6 List the operators in Java**

#### Operators in Java are as follow

- Unary Operator
  - Increment (++)
  - Decrement (--)
- Arithmetic Operator
  - Addition (+)
  - Subtraction (-)
  - Multiplication (\*)
  - Division (/)
  - Modulus (%)
- Shift Operator
  - Right Shift (>>)
  - Left Shift (<<)
- Relational Operator
  - Comparison (<, >, <=, >=)
  - Equality (==)
- Bitwise Operator
  - Bitwise AND (&)
  - Bitwise OR (|)
  - Bitwise Exclusive OR (^)
- Logical Operator
  - Logical AND (&&)
  - Logical OR (||)
- Ternary Operator
  - ?:
- Assignment Operator (=, +=, -=, \*=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=)

<br/>

### **7. Explain about increment and decrement operator and give example**

#### increment(++) and decrement(--) operators are unary operators in java

#### The Java unary operators require only one operand. Unary operators are used to perform various operations such as

- incrementing or decrementing a value by one.
- negating an expression
- inverting the value of a boolean

#### Java Unary Operator Example: ++ and --

```
public class OperatorExample {
    public static void main(String args[]) {
        int x=10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
    }
}
```

<u> OUTPUT </u>

10<br/>
12<br/>
12<br/>
10
