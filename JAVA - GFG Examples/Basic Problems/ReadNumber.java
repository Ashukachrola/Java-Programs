import java.util.Scanner;

class ReadNumber{
    public static void main(String [] args)
    {
        int num;

        System.out.println("Enter number : ");

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        System.out.println("Entered integer is : " + num);
    }
}