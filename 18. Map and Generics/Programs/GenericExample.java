import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Pravin");
        al.add("Vijaykuamr");
        // al.add(10); This operation is not allowed here because we have predefined the
        // type of ArrayList using generic
        System.out.println(al.get(0));
        System.out.println(al.get(1));
    
    }
}
