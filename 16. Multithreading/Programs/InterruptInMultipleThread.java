
class ThreadDemo1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1 : Focus is important " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread1 is interrupted");
            }
        }
    }
}

class ThreadDemo2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread2 : Focus is important " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread2 is interrupted");
            }
        }
    }
}

public class InterruptInMultipleThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo1 td1 = new ThreadDemo1();
        ThreadDemo2 td2 = new ThreadDemo2();

        Thread t1 = new Thread(td1);
        Thread t2 = new Thread(td2);
        t1.start();
        t2.start();
        t2.interrupt();
    }
}
