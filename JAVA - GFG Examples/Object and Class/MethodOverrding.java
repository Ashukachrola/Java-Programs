class Parent {
    private void m1(){
        System.out.println("From parent m1()");
    }
    protected void m2(){
        System.out.println("From parent m2()");
    }
}

class Child extends Parent {
    private void m1(){
        System.out.println("From Child m1()");
    }
    protected void m2(){
        System.out.println("From child m2()");
    }
}

public class MethodOverrding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m2();
        Parent p2 = new Parent();
        p2.m2();
    }
}
