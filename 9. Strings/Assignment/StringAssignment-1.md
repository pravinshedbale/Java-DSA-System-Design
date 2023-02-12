# Assignment (Strings in Java II)

### **1. What is a string in java?**

#### Strings are a sequence of characters. In the Java programming language, strings are objects.

#### Example - "pravin", "pr@v!n", "pr@ v_in "

<br/>

### **2. Types of String in Java are**

#### Type of strings in java are as follow

1. Mutable Strings - Mutable strings are those strings whose content can be changed without creating a new object. StringBuffer and StringBuilder are mutable versions of String in java.

2. Immutable Strings - Immutable strings are those who cannot be modified itself but can return separate modified string which in itself a whole new object. String class is used to create immutable version of string in java.

<br/>

### **3. In how many ways can you create string object in Java?**

#### String can be created using following ways in Java

1. ` String str = "Pravin";`
2. `String str = new String("Pravin");`
3. `StringBuilder sb = new StringBuilder("Pravin");`
4. `StringBuffer sb = new StringBuffer("Pravin");`

<br/>

### **4. What is a String Constant Pool?**

#### String Constant Pool is nothing but a storage area in Java heap where string literals stores. It is also known as String Intern Pool or String Constant Pool. It is just like object allocation. By default, it is empty and privately maintained by the Java String class

<br/>

### **5. What do you mean by mutable and immutable objects**

1. Mutable objects : The mutable objects are objects whose value can be changed after initialization. We can change the object's values, such as field and states, after the object is created.

2. Immutable Objects : The immutable objects are objects whose value can not be changed after initialization. We can not change anything once the object is created.

<br/>

### **6. Where exactctly is the string constant pool is located in the memory?**

#### String Constant Pool is located in the Java Heap Memory.
