import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, n1 = 0, n2 = 1, n3;

        System.out.println("Enter number");

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        System.out.print(n1+"\t"+n2);

        for(int i = 2; i < n; i++)
        {
            n3 = n1 + n2; 
            System.out.print("\t"+n3);
            n1 = n2;
            n2 = n3; 
        }
    }
}

//0 1 1 2 3 5 8 