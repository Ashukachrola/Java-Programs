import java.util.Scanner;

public class PrimeNumber1ToN {
    public static void main(String[] args) {

        int count, num, i;

        System.out.println("Enter number : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(num = 1; num <= n; num++)
        {
            count = 0;

            for(i = 2; i <= num/2; i++)
            {
                if(num % i == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0 && i != 1)
            {
                System.out.println(num);
            }
        }
    }
}



