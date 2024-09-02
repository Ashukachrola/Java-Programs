import java.util.Scanner;

public class Armstrong {

    public static int power(int base, int exponent)
    {
        int result = 1;
        for(int i = 0; i < exponent; i++)
        {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter Number :");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = n;
        int temp = 0, sum = 0, noOfDigit = 0;
        
        while(n > 0)
        {
            n = n / 10;
            noOfDigit++;
        }

        n = x;

        while(n > 0)
        {
            temp = n % 10;
            n = n / 10;

            sum = power(temp, noOfDigit) + sum;
        }

        System.out.println("Sum : "+sum);

        if(x == sum)
        {
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number is not armstrong");
        }
    }
}