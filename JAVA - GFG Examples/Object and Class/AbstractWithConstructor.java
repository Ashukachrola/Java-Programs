abstract class Subject {
    Subject(){
        System.out.println("Learning Subject");
    }

    abstract void Syllabus();

    void learn(){
        System.out.println("Prepare right now!");
    }
}

class IT extends Subject{
    void Syllabus(){
        System.out.println("c, java, c++");
    }
}

public class AbstractWithConstructor {
    public static void main(String[] args) {
        Subject s = new IT();

        s.learn();
        s.Syllabus();
    }
}
