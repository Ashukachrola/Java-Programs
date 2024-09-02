import java.util.Scanner;

abstract class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void makeSound();

    public String getName(){
        return name;
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println(getName() + " barks ");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println(getName() + " Meow ");
    }
}

public class AnimalAbstract {
    public static void main(String[] args) {

        String name;
        System.out.println("Enter animal name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        Animal an = new Cat(name);
        an.makeSound();
    }
}
