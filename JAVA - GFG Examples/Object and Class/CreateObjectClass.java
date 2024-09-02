import java.util.Scanner;

public class CreateObjectClass {

        String name;
        String breed;
        int age;
        String color;

        public CreateObjectClass(String name, String breed, int age, String color)
        {
            this.name = name;
            this.breed = breed;
            this.age = age;
            this.color = color;
        }

        public String getName()
        {
            return name;
        }

        public String getBreed()
        {
            return breed;
        }

        public int getAge()
        {
            return age;
        }

        public String getColor()
        {
            return color;
        }

        @Override public String toString()
        {
            return("Hi! My name is "+this.getName() + "\nMy Breed is "+this.getBreed() + "\nmy Age is "+this.getAge() + "\nMy color is "+this.getColor());
        }
    public static void main(String[] args) 
    {
        String name, breed, color;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values : ");

        name = sc.nextLine();
        breed = sc.nextLine();
        color = sc.nextLine();
        age = sc.nextInt();

        CreateObjectClass tuffy = new CreateObjectClass(name, breed, age, color);

        System.out.println(tuffy.toString());
    }
}
