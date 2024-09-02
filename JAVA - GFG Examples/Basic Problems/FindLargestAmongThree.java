import java.util.Scanner;

public class FindLargestAmongThree {
    public static void main(String[] args) {
        int n1, n2, n3;

        System.out.println("Enter three numbers \n");

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3)
        {
            System.out.println("Maximum number is : "+n1);
        }
        else if(n2 > n1 && n2 > n3)
        {
            System.out.println("Maximum number is : "+n2);
        }
        else
        {
            System.out.println("Maximum number is : "+n3);
        }
    }
}
