interface  Vehicle{
    void changeGear(int a);
    void speedUp(int a); 
    void breaks(int a);
}

class Bicycle implements Vehicle{
    int speed, gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override 
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void breaks(int decrement) {
        speed = speed - decrement;
    }

    public void printState() {
        System.out.println("Speed : " +speed + "\n Gear : " +gear);
    }
}

public class ExtraInterface {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.changeGear(2);
        b.speedUp(2);
        b.breaks(2);
        b.printState();
    }
}
