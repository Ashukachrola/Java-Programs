import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int temp, n1, n2;

        System.out.println("Enter Number 1 and number 2 : ");

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("Number 1 : "+n1+ "\nNumber 2 : "+n2);
    }
}
