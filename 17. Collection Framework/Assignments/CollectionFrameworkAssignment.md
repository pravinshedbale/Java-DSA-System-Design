# Assignment (Collection Framework)

### **1. What is collection framework in Java?**

#### A collections framework is a unified architecture for representing and manipulating collections, enabling collections to be manipulated independently of implementation details.

#### The collections framework consists of:

- Collection interfaces : Represent different types of collections, such as sets, lists, and maps. These interfaces form the basis of the framework.
- General-purpose implementations : Primary implementations of the collection interfaces.
- Legacy implementations : The collection classes from earlier releases, Vector and Hashtable, were retrofitted to implement the collection interfaces.
- Special-purpose implementations : Implementations designed for use in special situations. These implementations display nonstandard performance characteristics, usage restrictions, or behavior.
- Concurrent implementations : Implementations designed for highly concurrent use.
- Wrapper implementations : Add functionality, such as synchronization, to other implementations.
- Convenience implementations : High-performance "mini-implementations" of the collection interfaces.
- Abstract implementations : Partial implementations of the collection interfaces to facilitate custom implementations.
- Algorithms : Static methods that perform useful functions on collections, such as sorting a list.
- Infrastructure : Interfaces that provide essential support for the collection interfaces.
- Array Utilities : Utility functions for arrays of primitive types and reference objects. Not, strictly speaking, a part of the collections framework, this feature was added to the Java platform at the same time as the collections framework and relies on some of the same infrastructure.

<br/>

### **2. What is difference between ArrayList and LinkedList ?**

#### Difference between ArrayList and LinkedList is as follows :

| ArrayList                                                                                                                                                           | LinkedList                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| 1) ArrayList internally uses a dynamic array to store the elements.                                                                                                 | LinkedList internally uses a doubly linked list to store the elements.                                                                |
| 2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the other elements are shifted in memory. | Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory. |
| 3) An ArrayList class can act as a list only because it implements List only.                                                                                       | LinkedList class can act as a list and queue both because it implements List and Deque interfaces.                                    |
| 4) ArrayList is better for storing and accessing data.                                                                                                              | LinkedList is better for manipulating data.                                                                                           |
| 5) The memory location for the elements of an ArrayList is contiguous.                                                                                              | The location for the elements of a linked list is not contagious.                                                                     |
| 6) Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList.                                                              | There is no case of default capacity in a LinkedList. In LinkedList, an empty list is created when a LinkedList is initialized.       |
| 7) To be precise, an ArrayList is a resizable array.                                                                                                                | LinkedList implements the doubly linked list of the list interface.<br><br>                                                           |

<br/>

### **3. What is the difference between Iterator and ListIterator?**

#### Difference between Iterator and ListIterator is as follows :

| Iterator                                                                   | ListIterator                                                                                                         |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| Can traverse elements present in Collection only in the forward direction. | Can traverse elements present in Collection both in forward and backward directions.                                 |
| Helps to traverse Map, List and Set.                                       | Can only traverse List and not the other two.                                                                        |
| Indexes cannot be obtained by using Iterator.                              | It has methods like nextIndex() and previousIndex() to obtain indexes of elements at any time while traversing List. |
| Cannot modify or replace elements present in Collection                    | We can modify or replace elements with the help of set(E e)                                                          |
| Cannot add elements and it throws ConcurrentModificationException.         | Can easily add elements to a collection at any time.                                                                 |
| Certain methods of Iterator are next(), remove() and hasNext().            | Certain methods of ListIterator are next(), previous(), hasNext(), hasPrevious(), add(E e).                          |

<br/>

### **4. What is difference between Iterator and Enumeration ?**

#### Difference between Iterator and Enumeration is as follows :

| Iterator                                                                                                                                  | Enumeration                                                                                                                                          |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| Iterator is a universal cursor as it is applicable for all the collection classes.                                                        | Enumeration is not a universal cursor as it applies only to legacy classes.                                                                          |
| Iterator has the remove() method.                                                                                                         | Enumeration does not have the remove() method.                                                                                                       |
| Iterator can do modifications (e.g using remove() method it removes the element from the Collection during traversal).                    | Enumeration interface acts as a read only interface, one can not do any modifications to Collection while traversing the elements of the Collection. |
| Iterator is not a legacy interface. Iterator can be used for the traversal of HashMap, LinkedList, ArrayList, HashSet, TreeMap, TreeSet . | Enumeration is a legacy interface which is used for traversing Vector, Hashtable.<br><br>                                                            |

<br/>

### **5. What is difference between List and Set ?**

#### Difference between List and Set is as follows

| List                                                          | Set                                             |
| ------------------------------------------------------------- | ----------------------------------------------- |
| The List is an indexed sequence.                              | The Set is an non-indexed sequence.             |
| List allows duplicate elements                                | Set doesn’t allow duplicate elements.           |
| Elements by their position can be accessed.                   | Position access to elements is not allowed.     |
| Multiple null elements can be stored.                         | Null element can store only once.               |
| List implementations are ArrayList, LinkedList, Vector, Stack | Set implementations are HashSet, LinkedHashSet. |

<br/>

### **6. What is difference between HashSet and TreeSet ?**

#### Difference between HashSet and TreeSet is as follows :

| **HashSet**                                                                | **TreeSet**                                                                        |
| -------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| It internally uses HashMap to store the elements.                          | Internally it uses TreeMap to store the elements.                                  |
| The Data structure that HashSet uses is HashTable.                         | The Data Structure that TreeSet uses is a Red-Black Tree.                          |
| To add or remove the element from HashSet, the time complexity is O(1).    | For adding or removing the element from TreeSet, the time complexity is O(log(n)). |
| Only one null element can be stored in the HashSet.                        | No null elements are allowed.                                                      |
| The hashCode() or equals() method is used to compare the elements it uses. | The compare() and compareTo() method is used for comparison.                       |
| There is no guarantee that the elements will be stored in sorted order.    | TreeSet maintains the Sorted order.                                                |
| It is faster than TreeSet.                                                 | TreeSet is slower than HashSet.                                                    |
| HashSet can store Heterogenous values.                                     | You can store only homogenous values in TreeSet.                                   |
| In comparison to TreeSet, HashSet offers fewer methods.                    | TreeSet has more methods in comparison to HashSet.                                 |
| To iterate HashSet elements, it uses the arbitrary method.                 | It has sorted values.                                                              |

 <br/>

### **7. What is difference between Array and ArrayList?**

#### Difference between ArrayList and Array is as follows :

| **Array**                                                    | **ArrayList**                                                                                                               |
| ------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------- |
| It can be single-dimensional or multidimensional             | It can only be single-dimensional                                                                                           |
| For and for each generally is used for iterating over arrays | Here iterator is used to traverse riverArrayList                                                                            |
| length keyword can give the total size of the array.         | size() method is used to compute the size of ArrayList.                                                                     |
| It is static and of fixed length                             | It is dynamic and can be increased or decreased in size when required.                                                      |
| It is faster as above we see it of fixed size                | It is relatively slower because of its dynamic nature                                                                       |
| Primitive data types can be stored directly unlikely objects | Primitive data types are not directly added unlikely arrays, they are added indirectly with help of autoboxing and unboxing |
| They can not be added here hence type unsafe                 | They can be added here hence makingArrayList type-safe.                                                                     |
| Assignment operator only serves the purpose                  | Here a special method is used known as add() method                                                                         |
