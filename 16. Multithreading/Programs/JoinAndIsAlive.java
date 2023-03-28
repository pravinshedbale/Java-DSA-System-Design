class Printing implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Java DSA and System Design by PW");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("Problem occured");
        }
    }
}

public class JoinAndIsAlive {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");

        Printing printing = new Printing();
        Thread t1 = new Thread(printing);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println("Main thread end");
    }
}
