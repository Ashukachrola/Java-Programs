/**
 * I1
 */
interface I1 {
    final int i = 10;

    void display();
}

class MyNew implements I1{
    public void display(){
        System.out.println("Here the information");
    }
}

public class SimpleInterface {
    public static void main(String[] args) {
        MyNew n1 = new MyNew();
        
        n1.display();
        System.out.println(n1.i);
    }
}
