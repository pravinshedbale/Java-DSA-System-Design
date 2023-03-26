import java.util.Scanner;

class MyThread extends Thread {
    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        if (tName.equals("CalC Thread")) {
            calc();
        } else {
            impMessage();
        }
    }

    public void calc() {
        System.out.println("Calculation task started...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);
        System.out.println("Calculation task ended");
        System.out.println("*********************************");

    }

    public void impMessage() {
        System.out.println("Displaying important message task");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("This is pw's java course");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Exception in application");
        }
        System.out.println("Displaying important message task ended");
        System.out.println("*********************************");
    }

}

public class MultipleTaskInSingleRun {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("CalC Thread");
        t2.setName("ImpMessage Thread");
        t1.start();
        t2.start();
    }
}
