class Parent{
    public void Print(){
        System.out.println("Parent method");
    }
}

class SubClass1 extends Parent{
    public void Print(){
        System.out.println("Subclass 1 method");
    }
}

class SubClass2 extends Parent {
    public void Print(){
        System.out.println("Subclass 2 method");
    }
}

public class OverRidding {
    public static void main(String[] args) {
        SubClass1 p = new SubClass1();
        p.Print();
        SubClass2 p1 = new SubClass2();
        p1.Print();
        Parent p2 = new Parent();
        p2.Print();
    }
}
