class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class GetterAndSetterDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Pravin");
        s1.setAge(24);

        System.out.println("Student Name : " + s1.getName());
        System.out.println("Student Age : " + s1.getAge());
    }
}
