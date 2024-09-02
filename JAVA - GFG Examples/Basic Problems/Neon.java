import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        System.out.println("Enter Number");

        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        int square, sum = 0;

        square = num * num;

        while(square > 0)
        {
            int temp = square % 10;
            square = square / 10; 

            sum = sum + temp;
        }

        if(num == sum)
        {
            System.out.println("Number is Neon");
        }
        else
        {
            System.out.println("Number is not Neon");
        }
    }
}
