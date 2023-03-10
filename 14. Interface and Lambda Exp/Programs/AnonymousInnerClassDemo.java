interface Car {
    void drive();
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        Car car = new Car() {
            public void drive() {
                System.out.println("Drive");
            }
        };
        car.drive();
    }
}
