import java.util.Scanner;

public class ArmstrongBetweenTwo {

    public static int power(int base, int exponent)
    {
        int result = 1;

        if(exponent == 0)
        {
            return 1;
        }
        for(int i = 1; i <= exponent; i++)
        {
            result = result * base;
        }
        return result;
    }
    public static void main(String[] args) {
        int min, max, noOfDigit = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your lower limit to find armstrong");
        min = sc.nextInt();

        System.out.println("Enter your upper limit to find armstrong");
        max = sc.nextInt();

        int x = min;

        while(min > 0 && min < max)
        {
            min = min / 10;
            noOfDigit++;
        }

        min = x;
        int sum = 0;
        for(int i = min; i < max; i++)
        {
            int temp = min % 10;
            min = min / 10;
            sum = sum + power(temp, noOfDigit);
        }
    }
}
