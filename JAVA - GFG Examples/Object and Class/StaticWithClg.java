class Student {
    String name;
    int rollno;
    static String clgName;
    static int counter = 0;

    Student(String name){
        this.name = name;
        this.rollno = setrollno();
    }

    static int setrollno(){
        counter++;
        return counter;
    }

    static void setclgname(String name){
        clgName = name;
    }

    void getStudentInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("Rollno : "+this.rollno);
        System.out.println("Collage name : "+clgName);  
    }
}

public class StaticWithClg {
    public static void main(String[] args) {
        Student.setclgname("DU");
        Student s1 = new Student("Ashu" );
        Student s2 = new Student("Ashu2");

        s1.getStudentInfo();
        s2.getStudentInfo();
    }
}
