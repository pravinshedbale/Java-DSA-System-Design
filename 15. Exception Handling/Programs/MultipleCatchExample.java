
public class MultipleCatchExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            System.out.println(num1 / num2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
