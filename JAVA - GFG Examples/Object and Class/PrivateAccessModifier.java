//private -- access only in class

//This program gives an error because private method can.t be access

class A {
    private void m1() {
        System.out.println("Ashu");
    }
}

public class PrivateAccessModifier {
    A obj = new A();
    obj.m1();
}
