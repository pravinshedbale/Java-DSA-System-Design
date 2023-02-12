public class CheckPalindrome {
    public static void main(String args[]) {
        String str = "2552";
        StringBuilder buffer = new StringBuilder(str);
        buffer.reverse();
        String data = buffer.toString();
        if (str.equals(data)) {
            System.out.println("2552 is palindrome");
        } else {
            System.out.println("2552 is not palindrome");
        }
    }
}