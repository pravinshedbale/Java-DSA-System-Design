class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println("The type of data is : " + obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Gen<Integer> gen = new Gen<Integer>(10);
        gen.display();
        System.out.println(gen.getObj());
    }
}