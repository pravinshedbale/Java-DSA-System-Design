interface Laptop {
    void getConfiguration();

    void getBrandName();

    default void uses() {
        System.out.println("Day to day uses");
    }

}

class Hp implements Laptop {

    public void getConfiguration() {
        System.out.println("HP");
    }

    public void getBrandName() {
        // TODO Auto-generated method stub
        System.out.println("HP");
    }

    public void uses() {
        System.out.println("Overriden uses");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Hp hpLaptop = new Hp();
        hpLaptop.getBrandName();
        hpLaptop.getConfiguration();
        hpLaptop.uses();
    }
}