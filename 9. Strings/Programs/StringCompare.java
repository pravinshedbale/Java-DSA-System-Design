public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Ajay";
        String s2 = "Pravin";
        if (s1 == s2) {
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }

        String s3 = new String("Pravin");
        String s4 = new String("Pravin");

        if (s3.equals(s4)) {
            System.out.println("s3 and s4 are equal");
        } else {
            System.out.println("s3 and s4 are not equal");
        }
    }
}
