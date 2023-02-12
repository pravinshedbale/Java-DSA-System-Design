public class StringConcatenation {
    public static void main(String[] args) {
        String str = "Pravin";
        StringBuilder sb = new StringBuilder("Pravin");
        System.out.println(str + " Shedbale");
        System.out.println(str.concat(" Shedbale"));
        sb.append(" Shedbale");
        System.out.println(sb);
    }
}
