//public - Access modifier that means class can be access from any other class

public class AddTwoComplexNumber {

    //real, image - it is innstance variable , instance variable declare outside of any method, use to store unique data

    int real, image;

    //This is costructor. this is special method that is called when object of class is created.
    //public means construct can be access from any other class
    //it takes two parameters
    //this keyword reffer to the current object, it assign value parameter r to instance variable real
    //usage of this keyword - diffrentiate between local and instance variable

    public AddTwoComplexNumber(int r, int i)
    {
        this.real = r;
        this.image = i;
    }

    //method to show line...

    public void show()
    {
        System.out.println(this.real + "+i" + this.image);
    }

    //static - it means method belong to the class not any perticular object instance
    //method take two parameters n1 and n2 that is return a instance of AddTwoComplexNumber    

    public static AddTwoComplexNumber add(AddTwoComplexNumber n1, AddTwoComplexNumber n2)
    {
        AddTwoComplexNumber res = new AddTwoComplexNumber(0, 0);

        res.real = n1.real + n2.real;
        
        res.image = n1.image + n2.image;

        return res;
    }
    public static void main(String [] args)
    {
        AddTwoComplexNumber c1 = new AddTwoComplexNumber(4, 5);
        AddTwoComplexNumber c2 = new AddTwoComplexNumber(10, 5);    

        System.out.println("First complex number : ");
        c1.show();

        System.out.println("Second complex number : ");
        c2.show();

        //Calling add method

        AddTwoComplexNumber res = add(c1, c2);

        System.out.println(("\nAddition is : "));

        res.show();
    }
}
