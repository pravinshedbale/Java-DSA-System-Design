# Assignment (I/O Operation)

### **1. What is input and output stream in Java?**

#### A stream can be defined as a sequence of data. There are two kinds of Streams

1. InputStream

- The InputStream is used to read data from a source.

2. OutputStream

- The OutputStream is used for writing data to a destination.

<br/>

### **2. What are methods of OutputStream ?**

#### The OutputStream class provides different methods that are implemented by its subclasses. Here are some of the methods:

1. write() - writes the specified byte to the output stream
2. write(byte[] array) - writes the bytes from the specified array to the output stream
3. flush() - forces to write all data present in output stream to the destination
4. close() - closes the output stream

<br/>

### **3. What is serialization in Java?**

#### To serialize an object means to convert its state to a byte stream so that the byte stream can be reverted back into a copy of the object. A Java object is serializable if its class or any of its superclasses implements either the java.io.Serializable interface or its subinterface, java.io.Externalizable.

<br/>

### **4. What is Serializable interface in Java?**

#### Serializable interface is a marker interface. The marker interface provides a hint to the Java runtime that the implementing class allows itself to be serialized. The runtime will take advantage of this interface to serialize the object. Serializable interface in java is a special interface to be implemented by data classes in java. When a class implements this interface, it can be persisted in a database. This interface is declared in java.io package. Serializable interface has two methods, readResolve() and writeReplace() , which are used to read and write object in database.

<br/>

### **5. What is Deserialization in Java ?**

#### Deserialization is the process of reconstructing a data structure or object from a series of bytes or a string in order to instantiate the object for consumption. This is the reverse process of serialization, i.e., converting a data structure or object into a series of bytes for storage or transmission across devices.

<br/>

### **6. How is serialization achieved in Java ?**

#### Serialization is achieved in Java by implementing the Serializable interface. When an object is serialized, its state is converted into a stream of bytes, which can then be transferred over a network or stored in a file or database

<br/>

### **7. How is deserialization achieved in Java ?**

#### Deserialization is achieved in Java by reading a stream of bytes and using them to recreate the original object instance. This is done by calling the readObject() method of an ObjectInputStream instance.

<br/>

### **8. How can you avoid certain member variables of class from getting Serialized?**

#### You can mark that variable as either static or transient. Let’s see a simple example using transient variable. Transient variable is the variable whose value is not serialized during serialization. You will get default value for these variable when you deserialize it.

<br/>

### **9. What classes are available in the Java IO file classes API?**

1. File
2. RandomAccessFile
3. FileInputStream
4. FileReader
5. FileMutputStream
6. FileWriter

<br/>

### **10. What is a difference between Externalizable and Serializable interface?**

#### Difference between Externalizable and Serializable interface is as follows :

| Serializable                                                                                                                                                  |                                        Externalizable                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| A serializable interface is used to implement serialization.                                                                                                  | An externalizable interface used to implement Externalization                                                                             |
| Serializable is a marker interface i.e. it does not contain any method.                                                                                       | The externalizable interface is not a marker interface and thus it defines two methods *writeExternal()* and *readExternal()*.            |
| Serializable interface passes the responsibility of serialization to JVM and the programmer has no control over serialization, and it is a default algorithm. | The externalizable interface provides all serialization responsibilities to a programmer and hence JVM has no control over serialization. |
| Serialization using a serializable interface has bad performance.                                                                                             | Serialization using an externalizable interface has better performance.                                                                   |
| Default serialization does not require any no-arg constructor.                                                                                                | A public no-arg constructor is required while using an Externalizable interface.                                                          |
| It is hard to analyze and modify class structure because any change in structure may break serialization.                                                     | It is relatively easy to analyze and modify class structure because of complete control over serialization logic.                         |
| Using a serializable interface we save the total object to a file, and it is not possible to save part of the object.                                         | Base on our requirements we can save either the total object or part of the object.                                                       |
| Transient keywords play an important role here.                                                                                                               | Transient keywords won’t play any role.                                                                                                   |
