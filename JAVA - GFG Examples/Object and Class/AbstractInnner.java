abstract class Parent{
    abstract class Parent2{
        abstract void myParent();
    }
}

class A extends Parent{
    class B extends Parent2{
        void myParent(){
            System.out.println("My inside class method");
        }
    }    
}

public class AbstractInnner {
    public static void main(String[] args) {
        A outer = new A();
        A.B inner = outer.new B();

        inner.myParent();
    }
}
