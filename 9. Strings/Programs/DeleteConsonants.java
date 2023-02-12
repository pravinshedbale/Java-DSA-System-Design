public class DeleteConsonants {
    public static void main(String[] args) {
        String str = "Hello, have a good day";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        String ans = "";
        for (char c : str.toLowerCase().toCharArray()) {
            if (!consonants.contains(String.valueOf(c))) {
                ans += c;
            }
        }
        System.out.println("String after removing consonants : " + ans);
    }
}
