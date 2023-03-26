class Thread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 : " + i);
            try {
                Thread.sleep(1000000);
            } catch (InterruptedException e) {

            }
        }
    }

}

class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2 : " + i);
        }
    }

}

public class ThreadByInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
    }
}
