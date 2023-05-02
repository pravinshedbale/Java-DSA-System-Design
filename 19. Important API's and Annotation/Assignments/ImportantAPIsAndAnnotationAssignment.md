# Assignment (ImportantAPIAndAnnotation)

### **1. Program to display current date and time in Java?**

```
import java.time.*;

public class DateTimeAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day + "/" + month + "/" + year);

        LocalTime time = LocalTime.now();

        int hrs = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();

        System.out.println(hrs + ":" + min + ":" + sec);
    }
}
```

#### Output

```
30/4/2023
16:53:12
```

<br/>

### **2. Write a program to convert a date to a string in the format "MM/dd/yyyy"**

```
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ConvertDate {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
    }

}
```

#### Output

```
04/30/2023
```

<br/>

### **3. What is the difference between collections and streams? explain with an example**

#### Difference between Collectiond and Streams is as follows :

|   **STREAMS**                                                                                  |   **COLLECTIONS**                                                                                                                                                                                                                                         |
| ---------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| It doesn’t store data, it operates on the source data structure i.e collection.                | It stores/holds all the data that the data structure currently has in a particular data structure like Set, List or Map,                                                                                                                                  |
| They use functional interfaces like lambda which makes it a good fit for programming language. | They don’t use functional interfaces.                                                                                                                                                                                                                     |
| Java Streams are consumable i.e; to traverse the stream, it needs to be created every time.    | They are non-consumable i.e; can be traversable multiple times without creating it again.                                                                                                                                                                 |
| Java streams support both sequential and parallel processing.                                  | It supports parallel processing and parallel processing can be very helpful in achieving high performance.                                                                                                                                                |
| All the Java stream API interfaces and classes are in j**ava.util.stream** package.            | Specific classes for primitive types such as **IntStream**, **LongStream**, and **DoubleStream** are used in collections since primitive data types such as int, long in the collections using auto-boxing and these operations could take a lot of time. |
| Streams are not modifiable i.e one can’t add or remove elements from streams.                  | These are modifiable i.e one can easily add to or remove elements from collections.                                                                                                                                                                       |
| Streams are iterated internally by just mentioning the operations.                             | Collections are iterated externally using loops.                                                                                                                                                                                                          |

#### Example

```
import java.io.*;
import java.util.*;

// Main class
class StreamsAndCollections {

	// Main driver method
	public static void main(String[] args)
	{
		List<String> friendsList = new ArrayList<>();

		friendsList.add("Deepak");
		friendsList.add("Sushant");
		friendsList.add("Prabhakar");

		friendsList.stream().sorted().forEach(
			System.out::println);
	}
}

```

#### Output

```
Deepak
Prabhakar
Sushant
```

<br/>

### **4. What is enums in java ? explain with example**

#### An enum type is a special data type that enables for a variable to be a set of predefined constants. The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week.

#### Example

```
public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
```

#### Output

```
Mondays are bad.
Midweek days are so-so.
Fridays are better.
Weekends are best.
Weekends are best.
```

<br/>

### **5. What are inbuilt annotations in Java?**

#### Annotations in Java provide additional information to the compiler and JVM. An annotation is a tag representing metadata about classes, interfaces, variables, methods, or fields. Annotations do not impact the execution of the code that they annotate.

#### Below are inbuilt annotations in Java

1. @Override
2. @SuppressWarnings
3. @Deprecated
4. @SafeVarargs
5. @FunctionalInterface
6. @Native
