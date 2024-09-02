public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void getDetails() {
        System.out.println("name : "+this.name);
        System.out.println("age : "+this.age);
    }


    public static void main(String[] args) {
        Person first = new Person("Ashu", 20);
        Person second = new Person("Ashu Patel", 22);

        first.getDetails();
        second.getDetails();

        first.changeName("Ashu Kachrola");
        System.out.println("Name has been changed and new name is : "+first.getName());
    }
}