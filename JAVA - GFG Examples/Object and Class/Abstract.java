abstract class Sunstra{
    abstract void printInfo();
}

class Employee extends Sunstra{
    void printInfo()
    {
        String name = "Ashu";
        int age = 20;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

public class Abstract {
    public static void main(String[] args) {
        String name1;
        Sunstra s = new Employee();
        s.printInfo();
    }
}
