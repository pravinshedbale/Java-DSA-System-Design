# Assignment (Multithreading)

### **1. What do you mean by multithreading? Why it is important?**

#### Multithreading is a programming concept in which the application can create a small unit of tasks to execute in parallel. If you are working on a computer, it runs multiple applications and allocates processing power to them. A simple program runs in sequence and the code statements execute one by one.

#### Importance of multithreading

- Multithreading saves time as you can perform multiple operations together.
- The threads are independent, so it does not block the user to perform multiple operations at the same time and also, if an exception occurs in a single thread, it does not affect other threads.

<br/>

### **2. What are the benefits of using multithreading?**

#### Some of the benefits of using multithreading are as follows :

- Improved throughput. Many concurrent compute operations and I/O requests within a single process.

- Simultaneous and fully symmetric use of multiple processors for computation and I/O

- Superior application responsiveness. If a request can be launched on its own thread, applications do not freeze or show the "hourglass". An entire application will not block, or otherwise wait, pending the completion of another request.

- Improved server responsiveness. Large or complex requests or slow clients don't block other requests for service. The overall throughput of the server is much greater.

- Minimized system resource usage. Threads impose minimal impact on system resources. Threads require less overhead to create, maintain, and manage than a traditional process.

- Program structure simplification. Threads can be used to simplify the structure of complex applications, such as server-class and multimedia applications. Simple routines can be written for each activity, making complex programs easier to design and code, and more adaptive to a wide variation in user demands.

- Better communication. Thread synchronization functions can be used to provide enhanced process-to-process communication. In addition, sharing large amounts of data through separate threads of execution within the same address space provides extremely high-bandwidth, low-latency communication between separate tasks within an application.

<br/>

### **3. What is thread in Java?**

#### A thread in Java is the direction or path that is taken while a program is being executed. Generally, all the programs have at least one thread, known as the main thread, that is provided by the JVM or Java Virtual Machine at the starting of the program's execution.

<br/>

### **4. What are the two ways of implementing thread in Java ?**

#### Two ways of implementing thread in java are :

1. Extending Thread class.
2. Implementing Runnable interface

<br/>

### **5. What is the difference between thread and process?**

| Thread                                                                             | Process                                                                                                                                                                      |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Process means any program is in execution.                                         | Thread means a segment of a process.                                                                                                                                         |
| The process takes more time to terminate.                                          | The thread takes less time to terminate.                                                                                                                                     |
| It takes more time for creation.                                                   | It takes less time for creation.                                                                                                                                             |
| It also takes more time for context switching.                                     | It takes less time for context switching.                                                                                                                                    |
| The process is less efficient in terms of communication.                           | Thread is more efficient in terms of communication.                                                                                                                          |
| Multiprogramming holds the concepts of multi-process.                              | We don’t need multi programs in action for multiple threads because a single process consists of multiple threads.                                                           |
| The process is isolated.                                                           | Threads share memory.                                                                                                                                                        |
| The process is called the heavyweight process.                                     | A Thread is lightweight as each thread in a process shares code, data, and resources.                                                                                        |
| Process switching uses an interface in an operating system.                        | Thread switching does not require calling an operating system and causes an interrupt to the kernel.                                                                         |
| If one process is blocked then it will not affect the execution of other processes | If a user-level thread is blocked, then all other user-level threads are blocked.                                                                                            |
| The process has its own Process Control Block, Stack, and Address Space.           | Thread has Parents’ PCB, its own Thread Control Block, and Stack and common Address space.                                                                                   |
| Changes to the parent process do not affect child processes.                       | Since all threads of the same process share address space and other resources so any changes to the main thread may affect the behavior of the other threads of the process. |
| A system call is involved in it.                                                   | No system call is involved, it is created using APIs.                                                                                                                        |
| The process does not share data with each other.                                   | Threads share data with each other.                                                                                                                                          |

<br/>

### **6. How can we create daemon threads?**

#### Daemon thread in Java is a low-priority thread that runs in the background to perform tasks such as garbage collection. Daemon thread in Java is also a service provider thread that provides services to the user thread.

#### We can create daemon threads using following method

```
public void setDaemon(boolean status)
```

#### is used to mark the current thread as daemon thread or user thread.

#### Example

```
public class TestDaemonThread1 extends Thread{
 public void run(){
  if(Thread.currentThread().isDaemon()){//checking for daemon thread
   System.out.println("daemon thread work");
  }
  else{
  System.out.println("user thread work");
 }
 }
 public static void main(String[] args){
  TestDaemonThread1 t1=new TestDaemonThread1();//creating thread
  TestDaemonThread1 t2=new TestDaemonThread1();
  TestDaemonThread1 t3=new TestDaemonThread1();

  t1.setDaemon(true);//now t1 is daemon thread

  t1.start();//starting threads
  t2.start();
  t3.start();
 }
}
```

#### Output

```
daemon thread work
user thread work
user thread work
```

<br/>

### **7. What are the wait() and sleep() methods?**

1. Sleep() :
   The Sleep () method is related to the Thread class that is used to stop the execution of the current Thread for few seconds. The Sleep () method takes the sleeping time in milliseconds. The monitor's ownership is not lost when we use the Sleep () method and start the execution again from where it stops. In simple words, the Sleep() method is responsible for sending the current Thread into the "Non Runnable" state.

2. Wait() : The Wait() method is related to the Object class. The Wait() method is responsible for sending the calling thread into the waiting state. The Thread remains in the waiting state until another thread doesn't invoke the notify() or notifyAll() method for that object. The Thread resumes the execution after obtaining the ownership of the monitor.
