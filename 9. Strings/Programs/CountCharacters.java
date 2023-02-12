import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String vowels = "aeiou";
        int consonantCount = 0;
        int vowelsCount = 0;
        int specialCharacterCount = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (vowels.contains(String.valueOf(ch))) {
                vowelsCount++;
            } else if ((ch >= 'a' && ch < 'z') && (!vowels.contains(String.valueOf(ch)))) {
                consonantCount++;
            } else if ((ch != ' ' && ch != '\t' && ch != '.' && ch != ',') && !(ch <= '9' && ch >= '0')) {
                specialCharacterCount++;
            }
        }
        System.out.println("In given string there are : ");
        System.out.println(vowelsCount + " vowels.");
        System.out.println(consonantCount + " consonants.");
        System.out.println(specialCharacterCount + " special characters.");
        sc.close();
    }
}
