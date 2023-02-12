# Assignment (Strings in Java IV)

### **1. What is Mutable String in java explain with example?**

#### Mutable strings are those strings whose content can be changed without creating a new object. StringBuffer and StringBuilder are mutable versions of String in java

#### Example

```
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
```

#### Output

```
Pravin
Pravin is learning at ineuron
Pravin is learning at pwskills
```

<br/>

### **2. WAP to reverse a string**

```
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println("Original String : " + s);
        System.out.println("Reversed String : " + rev);
        sc.close();
    }
}

```

#### Output

```
PWSKILLS
Original String : PWSKILLS
Reversed String : SLLIKSWP
```

<br/>

### **3. WAP to reverse a sentence while preserving the position?**

```
import java.util.Scanner;
public class ReverseWordWithoutReversingOrder {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        str += sc.nextLine();
        sc.close();

        StringBuilder ans = new StringBuilder();

        for (String s : str.split(" ")) {
            StringBuilder word = new StringBuilder(s);
            ans.append(word.reverse() + " ");
        }

        System.out.println(ans);
    }
}
```

#### Output

```
I am learning at PWSkills
I ma gninrael ta sllikSWP
```

<br/>

### **4. WAP to sort string alphabetically**

```
import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.print("Sorted string : ");
        System.out.println(new String(charArray));
    }
}
```

#### Output

```
Enter string : pwskills
Sorted string : ikllpssw
```
