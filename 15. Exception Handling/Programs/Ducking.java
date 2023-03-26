public class Ducking {
    public static void operate() {
        try {
            divide();
        } catch (Exception e) {
        }
    }

    public static void divide() throws Exception {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        operate();
    }
}
