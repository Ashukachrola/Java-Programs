class Parent {
    void name() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    void name() {
        System.out.println("Child Method");
    }

    void display() {
        name();

        super.name();
    }
}

public class SuperWithMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
