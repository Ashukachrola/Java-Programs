class Vehicle {
    int max_speed = 120;
}

class Car extends Vehicle {
    int max_speed = 220;

    void display() {
        System.out.println("Max speed : "+super.max_speed);
    }
}

public class SuperWithVariable {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
