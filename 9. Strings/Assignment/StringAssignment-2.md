# Assignment (Strings in Java II)

### **1. Write a simple String program to take input from user?**

```
import java.util.Scanner;
public class StringProgram {
    public static void main(String[] arg) {
        String str = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        str = sc.nextLine();
        System.out.println("Entered String is : "+str);
    }
}
```

#### Output

```
Enter String :
Computer-Science-And-Engineering
Entered String is : Computer-Science-And-Engineering
```

<br/>

### **2. How do you concatenate two strings in Java? Give example**

#### Strings can be concatenated in Java using either of the following methods

1. Using + operator
2. Using String.concat() method.
3. Using StringBuilder.append() method

#### Example

```
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
```

#### Output

```
Pravin Shedbale
Pravin Shedbale
Pravin Shedbale
```

<br/>

### **3. How do you find the length of String in Java?**

#### We can find the length of string in java using inbuild function length()

#### Example

```
public class StringLength {
    public static void main(String[] args) {
        String str = "Pravin Shedbale";
        System.out.println("Length of String "+str+" is : "+str.length());
    }
}
```

#### Output

```
Length of String Pravin Shedbale is 15
```

<br/>

### **4. How do you compare two strings in Java? Give an example**

#### In case of string literals we can compare it using equality operator "==" and if String is created using new keyword then we can compare using String.equals() method

#### Example

```
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
```

#### Output

```
s1 and s2 are not equal
s3 and s4 are equal
```

<br/>

### **5. Write a program to find length of the string "refrigerator" ?**

```
public class StringLength {
    public static void main(String[] args) {
        String str = "refrigerator";
        System.out.println("Length of String "+str+" is : "+str.length());
    }
}
```

#### Output

```
Length of String refrigerator is 12
```

<br/>

### **6. Write a program to check if letter 'e' is present in word 'Umbrella'**

```
public class ContainsMethod {
    public static void main(String[] args) {
        String str = "Umbrella";
        if (str.contains("e")) {
            System.out.println("letter e is present in Umbrella");
        } else {
            System.out.println("letter e is not present in Umbrella");
        }
    }
}
```

#### Output

```
letter e is present in Umbrella"
```

 <br/>

### **7. Write a program to delete all consonants from the string "Hello, have a good day"?**

```
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
```

#### Output

```
String after removing consonants : eo, ae a oo a
```
