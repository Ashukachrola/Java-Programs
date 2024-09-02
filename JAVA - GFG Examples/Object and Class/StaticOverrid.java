class Parent {
    static void m1(){
        System.out.println("from parent static  method");
    }
    void m2(){
        System.out.println("from parent non static method");
    }
}

class Child extends Parent {
    static void m1(){
        System.out.println("Chilld static method");
    }
    @Override public void m2(){
        System.out.println("from child non static method");
    }
}

public class StaticOverrid {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.m1();
        obj.m2();
    }
}
