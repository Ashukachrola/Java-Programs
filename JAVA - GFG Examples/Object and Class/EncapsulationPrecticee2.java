class Encapsulation {
    private String name;
    private int age;
    private int rollno;

    public String getName(){
        return name;
    }

    public int getAge(){

        return age;
    }

    public int getrollno(){
        return rollno;
    }

    public void setName(String Name){
        this.name = Name;
    }

    public void setAge(int Age){
        this.age = Age;
    }

    public void setRollno(int Rollno){
        this.rollno = Rollno;
    }
}

public class EncapsulationPrecticee2 {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setName("Ashu");
        e.setAge(21);
        e.setRollno(147);

        System.out.println("Name : "+e.getName());
        System.out.println("Age : "+e.getAge());
        System.out.println("RollNo : "+e.getrollno());
    }    
}
