# Assignment (Loops and Pattern Programs)

### **1. Write a program to print Alphabets A, B, C, D, E, F, G, H using pattern programming logic?**

```
public class AlphabetPrint {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || j == n || i == n / 2 + 1) {
                    if ((i == 1 && j == 1) || (i == 1 && j == n)) {
                        System.out.print(" ");
                        continue;
                    }
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (i == 0 && j != n / 2 || j == 0 || j == n / 2 && i != 0 && i != n / 2 && i != n - 1
                        || i == n / 2 && j != n / 2 || i == n - 1 && j != n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (i == 0 && j != 0 || i == n - 1 && j != 0 || j == 0 && i != 0 && i != n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (i == 0 && j != n / 2 || i == n - 1 && j != n / 2 || j == 0 || j == n / 2 && i != 0 && i != n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (i == 0 || i == n - 1 || i == n / 2 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (i == 0 || i == n / 2 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 1 && i != 0 && i != n - 1) ||
                        ((i == 0 || i == n - 1) && j > 1 &&
                                j < n - 2)
                        || (i == ((n - 1) / 2) &&
                                j > 2 && j < n - 1)
                        || (j == n - 2 &&
                                i != 0 && i >= ((n - 1) / 2) && i != n - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - 4; j++) {
                if ((j == 0 || j == n - 4) || i <= n && i == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
```

#### Output

```
 *****
*     *
*     *
*******
*     *
*     *
*     *

* * *
*     *
*     *
* * *
*     *
*     *
* * *

  * * *
*
*
*
*
*
  * * *

* * *
*     *
*     *
*     *
*     *
*     *
* * *

* * * *
*
*
* * * *
*
*
* * * *

* * * *
*
*
* * * *
*
*
*

  ***
 *
 *
 * ***
 *   *
 *   *
  ***

*     *
*     *
*     *
* * * *
*     *
*     *
*     *
```

<br/>

### **2. Write a program to print triangle using star pattern programming logic?**

```
public class StarPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

#### Output

```
*
**
***
****
*****
```

<br/>

### **3. Write a program to print pattern ?**

```
public class SwitchExample {
    public static void main(String[] args) {
        //Declaring a variable for switch expression
        int number=20;

        //Switch expression
        switch(number){
        //Case statements
        case 10: System.out.println("10");
        break;

        case 20: System.out.println("20");
        break;

        case 30: System.out.println("30");
        break;
        //Default case statement
        default:System.out.println("Not in 10, 20 or 30");

        }
    }
}
```

#### Output

```
* * * * * * * * * * * * * *
* * * * * *     * * * * * *
* * * * *         * * * * *
* * * *             * * * *
* * *                 * * *
* *                     * *
*                         *
*                         *
*                         *
*                         *
*                         *
*                         *
*                         *
* * * * * * * * * * * * * *
```

<br/>

### **4. Write a program to print PW SKILLS using pattern programming logic?**

```

public class PWSkillsPattern {
    public static void main(String[] args) {
        int n = 5;

        // Print P
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n / 2)
                        && j < n - 1)
                    System.out.print("*");
                else if (i < n / 2
                        && j == n - 1 && i != 0)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        System.out.println();
        // Print W
        int counter = n / 2;
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j <= n; j++) {
                if (j == n)
                    System.out.printf("*");
                else if ((i >= n / 2)
                        && (j == counter
                                || j == n - counter - 1))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            if (i >= n / 2) {
                counter++;
            }
            System.out.printf("\n");
        }
        System.out.println();
        // print S
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n / 2
                        || i == n - 1))
                    System.out.printf("*");
                else if (i < n / 2
                        && j == 0)
                    System.out.printf("*");
                else if (i > n / 2
                        && j == n - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        System.out.println();
        // print K
        int half = n / 2, temp = half;
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j <= half; j++) {
                if (j == Math.abs(temp))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            temp--;
        }

        System.out.println();
        // print I
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1)
                    System.out.printf("*");
                else if (j == n / 2)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");

        }

        System.out.println();
        // print LL
        for (int t = 0; t < 2; t++) {
            for (int i = 0; i < n; i++) {
                System.out.printf("*");
                for (int j = 0; j <= n; j++) {
                    if (i == n - 1)
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }
                System.out.printf("\n");
            }
        }

        System.out.println();
        // print S
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n / 2
                        || i == n - 1))
                    System.out.printf("*");
                else if (i < n / 2
                        && j == 0)
                    System.out.printf("*");
                else if (i > n / 2
                        && j == n - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }

    }
}
```

#### Output

```
*****
*    *
*****
*
*

*     *
*     *
*  *  *
* * * *
**   **

*****
*
*****
    *
*****

*  *
* *
**
* *
*  *

*****
  *
  *
  *
*****

*
*
*
*
*******
*
*
*
*
*******

*****
*
*****
    *
*****
```

<br/>

### **5. Write a program to print your full name using pattern programming logic?**
