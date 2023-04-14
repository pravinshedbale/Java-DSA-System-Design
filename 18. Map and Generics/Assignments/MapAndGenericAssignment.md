# Assignment (Map and Generics)

### **1. What is Map in Java?**

#### A Map is an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value. It models the mathematical function abstraction. The Map interface includes methods for basic operations (such as put, get, remove, containsKey, containsValue, size, and empty), bulk operations (such as putAll and clear), and collection views (such as keySet, entrySet, and values).

<br/>

### **2. What are commonly used implementation of Map in java ?**

#### The commonly used implementations of Map in java are : HashMap, TreeMap, LinkedHashMap and ConcurrentHashMap

<br/>

### **3. What is the difference between HashMap and TreeMap?**

#### Difference between HashMap and TreeMap is as follows :

| Basis                      | HashMap                                                                                                                                  | TreeMap                                                                                                                                            |
| -------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| Definition                 | Java HashMap is a hashtable based implementation of Map interface.                                                                       | Java TreeMap is a Tree structure-based implementation of Map interface.                                                                            |
| Interface Implements       | HashMap implements Map, Cloneable, and Serializable interface.                                                                           | TreeMap implements NavigableMap, Cloneable, and Serializable interface.                                                                            |
| Null Keys/ Values          | HashMap allows a single null key and multiple null values.                                                                               | TreeMap does not allow null keys but can have multiple null values.                                                                                |
| Homogeneous/ Heterogeneous | HashMap allows heterogeneous elements because it does not perform sorting on keys.                                                       | TreeMap allows homogeneous values as a key because of sorting.                                                                                     |
| Performance                | HashMap is faster than TreeMap because it provides constant-time performance that is O(1) for the basic operations like get() and put(). | TreeMap is slow in comparison to HashMap because it provides the performance of O(log(n)) for most operations like add(), remove() and contains(). |
| Data Structure             | The HashMap class uses the hash table.                                                                                                   | TreeMap internally uses a Red-Black tree, which is a self-balancing Binary Search Tree.                                                            |
| Comparison Method          | It uses equals() method of the Object class to compare keys. The equals() method of Map class overrides it.                              | It uses the compareTo() method to compare keys.                                                                                                    |
| Functionality              | HashMap class contains only basic functions like get(), put(), KeySet(), etc. .                                                          | TreeMap class is rich in functionality, because it contains functions like: tailMap(), firstKey(), lastKey(), pollFirstEntry(), pollLastEntry().   |
| Order of elements          | HashMap does not maintain any order.                                                                                                     | The elements are sorted in natural order (ascending).                                                                                              |
| Uses                       | The HashMap should be used when we do not require key-value pair in sorted order.                                                        | The TreeMap should be used when we require key-value pair in sorted (ascending) order.                                                             |

<br/>

### **4. How do you check if key is exists in a Map in Java?**

#### We can check if a key exists in a Map in Java using the containsKey() methods or the get() method. The conainsKey() method returns a boolean value indicating whether the Map contais the specified key, while the get() method returns the value associated with the specific key, or null if the key is not present in the Map.

<br/>

### **5. What are Generics in Java ?**

#### Generics in Java are used to provide type safety and reduce code redundancy by allowing the use of generic types. It allows classes, methods and interfaces to be written generically without specifying the type of data being used.

<br/>

### **6. What are the benefits of using Generics in Java ?**

#### The benefits of using Generics in Java are :

1. Type safety
2. Code reusability
3. Improved readability
4. Reduced code redundancy
5. Improved performance

<br/>

### **7. What is a Generic class in Java?**

#### A generic class in Java is a class that can work with different types of data. It is defined using a type parameter enclosed in angle brackets, which represents the type of data being used

<br/>

### **8. What is a type parameter in Java Generics?**

#### A type parameter in Java Generics is a placeholder for the type of data that is being used by a generic class or method. It is defined using a single uppercase letter enclosed in angle brackets such as <`T`> or <`E`>

<br/>

### **9. What is a Generic method in Java?**

#### A Generic method in Java is a method that can work with different types of data. It is defined using a type parameter enclosed in angle brackets, which represents the type of data being used.

<br/>

### **10. What is a difference between ArrayList and ArrayList<`T`>?**

#### ArrayList is a non-generic class, while ArrayList<`T`> is a generic class. ArrayList<`T`> provides type safety, as it can only store elements of the specific type, whereas ArrayList can store any type of elements.
