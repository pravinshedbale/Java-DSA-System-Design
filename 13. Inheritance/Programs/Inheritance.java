class Person {

    Person() {
        System.out.println("Person class constructor");
    }

}

class Student extends Person {
    Student() {

        System.out.println("Student class constructor");
    }
}

public class Inheritance {
    public static void main(String[] arg) {
        Student s1 = new Student();
    }
}