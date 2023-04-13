import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student {
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
    }

}

public class HashMapOperations {
    public static void main(String[] args) {
        Student s1 = new Student("Rohan", 18, "Solapur");
        Student s2 = new Student("Pravin", 23, "Pune");
        Student s3 = new Student("Vikas", 22, "Mumbai");

        Map map = new HashMap();
        map.put(1, s1);
        map.put(2, s2);
        map.put(3, s3);

        System.out.println(map);

        // accessing keys and values

        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry entry = (java.util.Map.Entry) itr.next();

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
