import java.util.Scanner;

public class BinaryToOctal{

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

        int sum = 0;

        System.out.println("Enter size of array");

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++)
        {
            sum = (arr[i]*power(2, size-i-1)) + sum;
        }
        System.out.println(sum);
    }
}