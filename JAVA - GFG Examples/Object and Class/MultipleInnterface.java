interface A {
    default void show() {
        System.out.println("Default method");
    }
}

interface Interface1 extends A{
    void display();
}

interface Interface2 extends Interface1{
    void print();
}

public class MultipleInnterface implements Interface1, Interface2 {
    public void display(){
        System.out.println("Display method...");
    }

    public void print(){
        System.out.println("Print method");
    }

    public static void main(String[] args) {
        MultipleInnterface mi = new MultipleInnterface();
        mi.display();
        mi.print();
        mi.show();
    }
}
