class ThreadDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Focus is important " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted");
            }
        }
    }
}

public class InterruptMethod {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo td = new ThreadDemo();
        Thread t1 = new Thread(td);
        t1.start();

        t1.interrupt();
    }
}
