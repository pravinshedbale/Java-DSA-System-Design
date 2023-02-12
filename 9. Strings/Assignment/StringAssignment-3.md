# Assignment (Strings in Java III)

### **1. WAP to remove duplicates from a String?**

```
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String string = new String(sc.nextLine());
        String output = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : string.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char ch : string.toCharArray()) {
            if (map.get(ch) > 1) {
                continue;
            }
            output += ch;
        }
        System.out.println("String after removing duplicate : " + output);
    }
}

```

#### Output

```
Enter String : pwskills
String after removing duplicate : pwki
```

<br/>

### **2. WAP to print duplicate characters from string**

```
import java.util.HashMap;
import java.util.Scanner;

public class PrintDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String string = new String(sc.nextLine());
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : string.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println("Duplicate characters from string are as follows : ");
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                continue;
            }
            System.out.println(ch);
        }
    }
}

```

#### Output

```
Enter String : pwskills
Duplicate characters from string are as follows :
s
l
```

<br/>

### **3. WAP to check if "2552" is palindrome or not?**

```
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
```

#### Output

```
2552 is palindrome
```

<br/>

### **4. WAP to count the numbers of consonants, vowels, special characters in a String**

```
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
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
    }
}
```

#### Output

```
Enter String : pravinvshedbale009@gmail.com
In given string there are :
8 vowels.
15 consonants.
1 special characters.
```

<br/>

### **5. WAP to implement Anagram checking least inbuild method being used" ?**

```
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1 : ");
        str1 = sc.nextLine();

        System.out.print("Enter String 2 : ");
        str2 = sc.nextLine();

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        if (str1Arr.length != str2Arr.length) {
            System.out.println("Entered strings are not anagram");
            return;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1Arr[i] != str2Arr[i]) {
                    System.out.println("Entered strings are not anagram");
                    return;
                }
            }
        }
        System.out.println("Entered strings are anagram");
    }
}

```

#### Output

```
Enter String 1 : listen
Enter String 2 : silent
Entered strings are anagram

Enter String 1 : gym
Enter String 2 : jym
Entered strings are not anagram
```

<br/>

### **6. WAP to implement pangram checking with least inbuilt methodd being used'**

```
import java.util.Scanner;

public class PangramCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String:");
        String str = sc.nextLine();

        sc.close();

        str = str.replaceAll("", "").toLowerCase();

        String s = "";
        for (char i = 'a'; i <= 'z'; i++) {
            if (str.indexOf(i) != -1) {
                s = s + i;
            }
        }
        if (s.length() == 26) {
            System.out.println("Entered string is pangram");
        } else {
            System.out.println("Entered string is not pangram");
        }
    }
}
```

#### Output

```
Enter String:asdgasdfakjvnjkabnsdhbgaksd
Entered string is not pangram

Enter String:abcdefghijklmnopqrstuvwxyz
Entered string is pangram
```

 <br/>

### **7. WAP to find if string contains all the unique characters**

```
import java.util.HashMap;
import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        str = sc.nextLine();

        sc.close();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                System.out.println("String does not contains unique characters");
                return;
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println("String contains all unique characters");
    }
}

```

#### Output

```
Enter String : pwskil
String contains all unique characters

Enter String : pwskills
String does not contains unique characters
```

 <br/>

### **8. WAP to find maximum occuring character in a String**

```
import java.util.Scanner;

public class MaximumOccuringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter String : ");
        str = sc.nextLine();
        int[] freq = new int[str.length()];
        char maxChar = str.charAt(0);
        int i, j, max;

        char string[] = str.toCharArray();
        for (i = 0; i < string.length; i++) {
            freq[i] = 1;
            for (j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }

        max = freq[0];
        for (i = 0; i < freq.length; i++) {
            if (max < freq[i]) {
                max = freq[i];
                maxChar = string[i];
            }
        }
        System.out.println("Maximum occurring character in given string is : " + maxChar);
    }
}
```

#### Output

```
Enter String : pwskill
Maximum occurring character in given string is : l
```
