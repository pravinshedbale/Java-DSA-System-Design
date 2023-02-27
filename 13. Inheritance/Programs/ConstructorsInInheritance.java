class Parent {
    Parent() {
        System.out.println("Parent class constructor with 0 arguments");
    }

    Parent(int n) {
        System.out.println("Parent class constructor with 1 argument");
    }
}

class Child extends Parent {
    Child() {
        this(1);
        System.out.println("Child class constructor with 0 arguments");
    }

    Child(int n) {
        System.out.println("Child class constructor with 1 argument");
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
