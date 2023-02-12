public class MutableString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // appending new string to sb
        sb.append("Pravin ");
        System.out.println(sb);

        // appending another string to same string
        sb.append("is learning at ineuron ");
        System.out.println(sb);

        // removing some part of same string
        sb.replace(7, sb.length(), "");

        // again appending another string to same string
        sb.append("is learning at pwskills");
        System.out.println(sb);

    }
}
