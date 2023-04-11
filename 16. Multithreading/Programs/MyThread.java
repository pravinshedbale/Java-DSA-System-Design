
class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread 1 started...");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread1 : " + i);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread2 : " + i);
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}