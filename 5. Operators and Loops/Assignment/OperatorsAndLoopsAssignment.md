# Assignment (Operators and Assignment)

### **1. What are the conditional operators in Java?**

#### The Conditional Operators: The && and || operators perform Conditional-AND and Conditional-OR operations on two boolean expressions. These operators exhibit "short-circuiting" behavior, which means that the second operand is evaluated only if needed.

- && Conditional-AND
- || Conditional-OR
- Another conditional operator is ?:, which can be thought of as shorthand for an if-then-else statement. This operator is also known as the ternary operator because it uses three operands.

<br/>

### **2. What are the types of operators based on the number of operands?**

#### Based on numbers of operands there are 3 types of operators

- Unary Operator (Single operand)
- Binary Operator (Two operands)
- Ternary Operator (Three operands)

  <br/>

### **3. What is the use of switch case in Java Programming?**

#### The switch case in java is used to select one of many code blocks for execution.

#### Break keyword: As java reaches a break keyword, the control breaks out of the switch block. The execution of code stops on encountering this keyword, and the case testing inside the block ends as the match is found.

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
20
```

<br/>

### **4. What are the priority levels of arithmetic operators in Java?**

- Multiplication, division, and modulo operations have precedence over addition and subtraction operations.

- Plus and minus operators have the same precedence. Operators with the same precedence are evaluated from left to right.

<br/>

### **5. What are the conditional statements and use of conditional statements in Java ?**

#### Control statements controls the flow of the execution of the program. Controlling here means branching, decision-making, and iterating.

#### Generally, there are 3 types of Control Structures in Java:

- Conditional Statements or Decisional Statements (if, if-else, switch)
- Iteration Statements or Loops (for, while, do-while, for-each)
- Jump Statements (break, continue, return)

<br/>

### **6. What is the syntax of if-else statement in Java?**

#### Syntax of if-else statement

```
if (condition) {
    // Executes this block if
    // condition is true
} else {
    // Executes this block if
    // condition is false
}
```

<br/>

### **7. What are the three types of iterative statements in Java**

#### Iterative statements in Java are as follows

- for statement
- while statement
- do statement

<br/>

### **8. Write the difference between while loop and do-while loop**

#### Difference between while and do-while loop is as follows

| While Loop                                                                 | Do While Loop                                                           |
| -------------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| Condition is checked first then statement(s) is executed.                  | Statement(s) is executed atleast once, thereafter condition is checked. |
| It might occur statement(s) is executed zero times, If condition is false. | At least once the statement(s) is executed.                             |
| No semicolon at the end of while. while(condition)                         | Semicolon at the end of while(condition); while.                        |
| If there is a single statement, brackets are not required.                 | Brackets are always required.                                           |
| while loop is entry controlled loop.                                       | do-while loop is exit controlled loop.                                  |
| while(condition){ statement(s); }                                          | do { statement(s); } while(condition);                                  |

### **8. Write a program to print numbers from 1 to 10**

```
public class PrintNumbers {
    public static void main(String[] arg) {
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }
}
```

#### Output

```
1
2
3
4
5
6
7
8
9
10
```
