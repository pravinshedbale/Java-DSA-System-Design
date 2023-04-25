# Assignment3 (Complexity Analysis and Array)

### **1. Analyze the time complexity of the following Java code and suggest way to improve it?**

```
int sum = 0;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        sum++;
    }
}
```

#### between 1 and n (inclusive) and j is between 1 and i (inclusive).

#### For each pair (i, j), the code increments the variable sum by 1.

#### At the end of the loop, the variable sum will contain the sum of all integers from 1 to n.

#### The time complexity of this algorithm is O(n^2) because it has two nested loops that each iterate n times.

#### optimization that can be made is to use a formula for the sum of integers from 1 to n, which is n(n+1)/2. By using this formula, we can avoid the nested loop and calculate the sum directly in O(1) time complexity. Here's the updated code:

```
int sum = n * (n + 1) / 2;
```

<br/>

### **2. Find the value of T(2) for the recurrence relation T(n) = 3T(n-1) + 12n, given that T(0) = 5**

```
To find the value of T(2) for the recurrence relation T(n) = 3T(n-1) + 12n, we can use the formula recursively:

T(2) = 3T(1) + 12(2)
T(2) = 3[3T(0) + 12(1)] + 12(2) (substituting T(1) using the recurrence relation)
T(2) = 3[3(5) + 12(1)] + 12(2) (substituting T(0))
T(2) = 63

Therefore, the value of T(2) for the recurrence relation T(n) = 3T(n-1) + 12n, given that T(0) = 5 is 63.
```

<br/>

### **3. Given a recurrence relation, solve it using substitution method. Relation : T(n) = T(n-1) + c**

```
T(n) = T(n-1) + c
= T(n-2) + c + c
= T(n-3) + c + c + c
= ...
= T(n-k) + kc

We can choose k = n-1 to obtain:

T(n) = T(1) + (n-1)c

Since T(1) is a constant, we can say that the time complexity of T(n) is O(n).
```

<br/>

### **4. Given recurrence relation : T(n) = 16T(n/4) + n2logn, find the complexity ot this using the master theorem**

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
